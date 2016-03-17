package music;
/*
 *  Repeat class represents repeat sections in ABC music, 
 *  containing repeated measures and alternative endings.
 *  	Rep invariant:
 *  		the Repeat class is immutable.
 *  		meas and endings are final.
 *  		
 */

import java.util.ArrayList;
import java.util.List;


public class Repeat implements Sequence{
	/**
	 *    meas represents the common part of the repetition
     *    ending means the alternative ending measures
	 */
	private final List<Measure> meas;

	/**
	 * Constructor of the repeat object 
	 * @param the list of measures to be repeated without alternative ending 
	 */
	public Repeat(List<Measure> measues){
		List<Measure> list= new ArrayList<Measure>();
		list.addAll(measues);
		list.addAll(measues);
		
		this.meas = list;
	}
	
	/**
	 * Constructor of the repeat object
	 * @param list of measures to be repeated 
	 * @param the alternative ending of the repetition
	 */
	public Repeat(List<Measure> measues, List<Measure> alternative){
		List<Measure> l = new ArrayList<Measure>();
		
		for(int i =0; i < alternative.size();i++  ){
			l.addAll(measues);
			l.add(alternative.get(i));
		}
		
		this.meas = l;
	}
	
	/**
	 * Getter method for the repeat 
	 * @return a List of measures of the repetition
	 */
	public List<Measure> getRepeat(){
		return meas;
	}
	
	/**
	 *  Allows a visitor to process the object
	 * @return 
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	/**
	 * @return a string representation of the Repeat 
	 */
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append("|: ");
		for(Measure m: meas){
			s.append(m.toString());
		}
		return s.toString();
	}
}
