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
	private SequencePlayer player ;

	public void visit(Song s) {
		
		/*
		 * Construct tempo and TickTimePerQuarter of a   SequencePlayer
		 */
		tempo = s.getHeader().getTempo();
		TickPerQuater = s.getTickTime();
		
		s.getVoices().get(1).accept(this);
		System.err.println(s.getVoices().get(0).toString());
		s.getHeader().accept(this);
		
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
		int numTicks = n.getDuration().getNumerator()*TickPerQuater/
				n.getDuration().getDenominator();
		int frequency =n.getKey().getPitch().toMidiNote(); 
		
		player.addNote(frequency, startTick, numTicks);
		startTick += numTicks;
	}

	@Override
	public void visit(Chord c) {
		// TODO Auto-generated method stub
		int numTicks = c.getDuration().getNumerator()*TickPerQuater/
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
	
	
	public void play() throws MidiUnavailableException, InvalidMidiDataException{
		 player = new SequencePlayer(tempo, TickPerQuater);	

	}

	@Override
	public void visit(Header h) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Repeat r) {
		// TODO Auto-generated method stub
		
	}
	
}
