package music;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import sound.SequencePlayer;

/*
 * the interface that all visitor have to implement
 */
public class SequenceVisitor implements Visitor{
	private int tempo;
	private int TickPerQuater;
	private int startTick = 0;
	private int meter_numerator ;
	private int meter_denominator;
	private  SequencePlayer player ;

	public void ConstructPlayer(SequencePlayer player,int TickPerQuarter ){
				this.player = player;
				TickPerQuater = TickPerQuarter;
	}
	
	
	@Override
	public void visit(Song s) {
		s.getHeader().accept(this);
		tempo = s.getHeader().getTempo();
		s.getVoices().get(1).accept(this);
		
	}

	@Override
	public void visit(Voice v) {
		// TODO Auto-generated method stub
		for(Measure measure: v.getMeasures()){
			measure.accept(this);
		}
		
	}

	@Override
	public void visit(Measure m) {
		// TODO Auto-generated method stub
		for(Music music: m.getMusics()){
			music.accept(this);
		}
	}

	@Override
	public void visit(Note n) {
		// TODO Auto-generated method stub
		
		
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
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		for(Music m: t.getMusic()){
			m.accept(this);
		}
	}
	

	@Override
	public void visit(Header h) {
		// TODO Auto-generated method stub
		
	}
		
	@Override
	public void visit(Repeat r) {
		// TODO Auto-generated method stub
		
	}
	
		
	public SequencePlayer getPlayer(){
		return player;
	}
	

	
	
}
