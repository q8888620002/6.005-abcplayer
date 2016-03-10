package music;

import static org.junit.Assert.*;

import org.junit.Test;

public class DurationTest {
	
	  // make sure assertions are turned on!  
	// we don't want to run test cases without assertions too.
	// see the handout to find out how to turn them on.
	@Test(expected=AssertionError.class)
	public void testAssertionsEnabled() {
		assert false;
		}
	
	@Test
	public void DurationInitTest1(){
		Duration f = new Duration(1, 2);
		assertEquals("1/2", f.toString());
 	}
	
	/*
	 * check the Duration init with illegal numerator 
	 */
	@Test (expected=AssertionError.class)
	public void IllegalNumeratorTest1(){
		Duration f = new Duration(-1, 1);
	}
	
	/*
	 * check the Duration init with illegal denominator 
	 */
	@Test (expected=AssertionError.class)
	public void IllegalDenominatorTest1(){
		Duration f = new Duration(1, -1);
	}
	

	/*
	 * check the Duration init with illegal denominator and numerator
	 */
	@Test (expected=AssertionError.class)
	public void IllegalTest1(){
		Duration f = new Duration(-1, -1);
	}
	
	
	@Test
	public void DurationInitTest2(){
		Duration f = new Duration(2, 4);
		assertEquals("2/4", f.toString());
 	}
	@Test
	public void DurationInitTest3(){
		Duration f = new Duration(20, 60);
		assertEquals("20/60", f.toString());
 	}
	
	@Test
	public void DurationInitTest4(){
		Duration f = new Duration(7, 48);
		assertEquals("7/48", f.toString());
 	}
	
	/*
	 * Test common denominator
	 */
	@Test 
	public void  LCMNumeratorTest1(){
		Duration f1 = new Duration(1, 2);
		Duration f2 = f1.getLCD(3);
		assertEquals("3/6", f2.toString());
	}
	
	
	/*
	 * Test common denominator
	 */
	@Test 
	public void  LCMNumeratorTest2(){
		Duration f1 = new Duration(4, 4);
		Duration f2 = f1.getLCD(3);
		assertEquals("12/12", f2.toString());
	}
	
	/*
	 * Test common denominator
	 */
	@Test 
	public void  LCMNumeratorTest3(){
		Duration f1 = new Duration(4, 4);
		Duration f2 = f1.getLCD(2);
		assertEquals("4/4", f2.toString());
	}
	
	/*
	 * Test common denominator
	 */
	@Test 
	public void  LCMNumeratorTest4(){
		Duration f1 = new Duration(4, 5);
		Duration f2 = f1.getLCD(2);
		assertEquals("8/10", f2.toString());
	}
	
	/*
	 * Test common denominator
	 */
	@Test 
	public void  LCMNumeratorTest5(){
		Duration f1 = new Duration(4, 9);
		Duration f2 = f1.getLCD(3);
		assertEquals("4/9", f2.toString());
	}
	
	@Test 
	public void  LCMNumeratorTest6(){
		Duration f1 = new Duration(4, 9);
		Duration f2 = f1.getLCD(4);
		assertEquals("16/36", f2.toString());
	}
	
	@Test 
	public void  LCMNumeratorTest7(){
		Duration f1 = new Duration(7, 12);
		Duration f2 = f1.getLCD(5);
		assertEquals("35/60", f2.toString());
	}
}
