package music;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

/*
 * The "Visitor" interface, as described in the Visitor Pattern
 */
public interface Visitor {

	public void visit(Header h);
	public void visit(Voice v);
	public void visit(Repeat r);
	public void visit(Measure m);
	public void visit(Note n);
	public void visit(Chord c);
	public void visit(Tuplet t);
	public void visit(Song s) throws MidiUnavailableException, InvalidMidiDataException;
}
