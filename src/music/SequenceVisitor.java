package music;

import sound.SequencePlayer;

/*
 * the interface that all visitor have to implement
 */
public class SequenceVisitor implements Visitor{
	private SequencePlayer player;
	
	public void visit(Song s) {
		
		/*
		 * Construct a SequencePlayer
		 */
		player = new SequencePlayer(s.getHeader().getTempo(), s.getTickTime());
		s.getHeader().accept(this);
	}

	@Override
	public void visit(Header h) {
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
	public void visit(Repeat repeat) {
		// TODO Auto-generated method stub
		
	}

	
}
