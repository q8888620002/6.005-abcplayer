package music;


import sound.SequencePlayer;

/*
 *  Visitor visits a Song to add note to a SequencePlayer
 *  	
 */
public class SequenceVisitor implements Visitor{

	private int TickPerQuater;
	private int startTick ;
	private  SequencePlayer player ;

	/**
	 * Constructor for the Song player 
	 * 
	 */
	public void ConstructPlayer(SequencePlayer player,int TickPerQuarter ){
				this.player = player;
				TickPerQuater = TickPerQuarter;
	}
	
	@Override
	public void visit(Song s) {
		
		for(int i = 1; i < s.getVoices().size()+1;i++){
			startTick =0;
			s.getVoices().get(i).accept(this);
		}
	}

	@Override
	public void visit(Voice v) {
		
		for(Measure measure: v.getMeasures()){
			measure.accept(this);
		}
		
	}

	@Override
	public void visit(Measure m) {
		
		for(Music music: m.getMusics()){
			music.accept(this);
		}
	}

	@Override
	public void visit(Note n) {
		
		int numTicks = n.getDuration().getNumerator()*TickPerQuater*4/
				n.getDuration().getDenominator();
		
		if(n.getKey()!=null){
			int frequency =n.getKey().getPitch().toMidiNote(); 
			
			player.addNote(frequency, startTick, numTicks);
		}
		
		startTick += numTicks;
	}

	@Override
	public void visit(Chord c) {
		
		int numTicks = c.getDuration().getNumerator()*TickPerQuater*4/
				c.getDuration().getDenominator();
		
		for(Note n: c.getNotes()){
			int frequency =n.getKey().getPitch().toMidiNote(); 
			player.addNote(frequency, startTick, numTicks);
		}
		
		startTick += numTicks;
	}

	@Override
	public void visit(Tuplet t) {
		for(Music m: t.getMusic()){
			m.accept(this);
		}
	}
	
	/**
	 * Getter for the player 
	 * @return player 
	 */
	public SequencePlayer getPlayer(){
		return player;
	}
	

	
	
}
