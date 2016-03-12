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
	private final List<Measure> endings;

	
	/**
	 * Constructor of the repeat object 
	 * @param the list of measures to be repeated without alternative ending 
	 */
	public Repeat(List<Measure> measues){
		List<Measure> list= new ArrayList<Measure>();
		list.addAll(measues);
		list.addAll(measues);
		this.meas = list;
		this.endings = null;
	}
	
	/**
	 * Constructor of the repeat object
	 * @param list of measures to be repeated 
	 * @param the alternative ending of the repetition
	 */
	public Repeat(List<Measure> measues, List<Measure>alternative){
		List<Measure> l = measues;
		
		for(int i =0; i < alternative.size()-1;i++  ){
			l.add(alternative.get(i));
			l.addAll(measues);
		}
		
		this.meas = measues;
		this.endings = alternative;
	}
	
	/**
	 * Getter method for the repeat 
	 * @return a List of measures of th repetition
	 */
	public List<Measure> getRepeat(){
		return meas;
	}
	
	/**
	 *  Allows a visitor to process the object
	 */
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	
	/**
	 * @return a string representation of the Repeat 
	 */
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append("|: ");
		for(Measure m: meas){
			s.append(m.toString());
		}
		return s.toString();
	}
}
