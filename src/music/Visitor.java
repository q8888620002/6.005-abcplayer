package music;


/*
 * The "Visitor" interface, as described in the Visitor Pattern
 */
public interface Visitor {
	public void visit(Repeat repeat);
	public void visit(Header h);
	public void visit(Body b); 
	public void visit(Voice v);
	public void visit(Measure m);
	public void visit(Note n);
	public void visit(Chord c);
	public void visit(Tuplet t);
}
