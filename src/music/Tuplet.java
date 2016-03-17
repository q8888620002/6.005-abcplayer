package music;
/*
 *  A Tuplet contains a group of Notes/chords 
 *  which are played successfully with same duration.
 *  
 *  Rep invariant:
 *   	This class is immutable.
 *   	the list of notes is final 
 *   	tuplet-type is final 
 *   	all music duration within the tuplet should be the same 
 *   	TupletType should be :
 *   			DUPLET
 *   			TRIPLET
 *   			QUADRUPLET
 *   			
 */

import java.util.ArrayList;
import java.util.List;


public class Tuplet implements Music,Sequence{
	private final  List<Music> musics;
	private final TupletType type;
	
	/**
	 * Construct a new Tuplet class with group of music & type of tuplet  
	 * the size of music should be the same as tuplet-type
	 * @param type DIPLET, TRIPLET, QUADRUTUPLET 
	 * @param array music NOTE or CHORD 
	 */
	public Tuplet(TupletType type, Music...music){
		List<Music> musics = new ArrayList<Music>();
		for(Music m: music){
			musics.add(m.changeDuration(type.size()));
		}
		this.musics = musics;
		this.type = type;
		
		checkRep();
	}
	
	/**
	 * Construct a new Tuplet class with group of music & type of tuplet  
	 * the size of music should be the same as tuplet-type
	 * @param type DIPLET, TRIPLET, QUADRUTUPLET 
	 * @param array music NOTE or CHORD 
	 */
	public Tuplet(TupletType type, List<Music> music){
		List<Music> musics = new ArrayList<Music>();
		for(Music m: music){
			musics.add(m.changeDuration(type.size()));
		}
		this.musics = musics;
		this.type = type;
		
		checkRep();
	}
	
	
	/**
	 * check rep of Tuplet
	 */
	private void checkRep(){
		for(int i=0;i < musics.size()-1 ;i++){
			assert(musics.get(i).getDuration().equals(musics.get(i+1).getDuration())):
				"All duration whthin the tuplet should be the same";
		}
		
		assert (type.size()== musics.size()):
			"number of music element should be the same as type declared";
	}
	
	/**
	 * 
	 * @return the type of the tuplet element.
	 */
	
	public String getType(){
		return type.toString();
	}
	
	/**
	 * for debug usage
	 * @return a List of music 
	 */
	public List<Music> getMusic(){
		return musics;
	}
	
	/**
	 * visitor method for sequence interface
	 * @return 
	 */

	@Override
	public void accept(Visitor s) {
		// TODO Auto-generated method stub
		s.visit(this);
	}



	@Override
	public Duration getDuration() {
		// TODO Auto-generated method stub
		return musics.get(0).getDuration();
	}

	/**
	 * Change the representation of duration in musics.
	 * 
	 * @param the integer denominator of this tuplet.
	 * @return a new Tuplet containing a List of music. 
	 */

	@Override
	public Tuplet changeDuration(int denominator) {
		List<Music> newL = new ArrayList<Music>();
		for(Music m: musics){
			newL.add(m.changeDuration(denominator));
		}
		return new Tuplet(type, newL);
	}
	
	
	/**
	 * @return a string representation of a tuplet 
	 */
	@Override
	public String toString(){
		String tuplet = type.toString();
		for(Music m: musics){
			tuplet+=m.toString();
		}
		return tuplet;
	}

	
	
}
