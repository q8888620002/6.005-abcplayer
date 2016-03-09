package music;

import sound.SequencePlayer;

/*
 * the interface that all visitor have to implement
 */
public class SequenceVisitor implements Visitor{
	private SequencePlayer player;
	
	@Override
	public void visit(Song s) {
		// TODO Auto-generated method stub
		s.getHeader().accept(this);
	}

	private void SequencePlayer(Sequence s) {
		// TODO Auto-generated method stub
		s.accept((Visitor) s);
	}

	@Override
	public void visit(Header h) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void visit(Body b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Voice v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Measure m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Note n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Chord c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Tuplet t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Rest r) {
		// TODO Auto-generated method stub
		
	}
	
}
