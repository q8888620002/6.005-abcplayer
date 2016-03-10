package music;
/*
 *  A Tuplet contains a group of Notes/chords 
 *  which are played successfully with same duration.
 *  
 *  Rep invariant:
 *   	This class is immutable.
 *   	the list of notes is final 
 *   	tuplet-type is final 
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
	private final Duration duration;
	private final TupletType type;
	
	public Tuplet(TupletType type, Music...music){
		List<Music> musics = new ArrayList<Music>();
		for(Music m: music){
			musics.add(m);
		}
		this.musics = musics;
		this.type = type;
	}
	
	
	
	/**
	 * 
	 * @return the type of the tuplet element.
	 */
	
	public String getType(){
		return type.toString();
	}
	
	/**
	 * visitor method for sequence interface
	 */

	@Override
	public void accept(Visitor s) {
		// TODO Auto-generated method stub
		s.visit(this);
	}



	@Override
	public Duration getDuration() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
