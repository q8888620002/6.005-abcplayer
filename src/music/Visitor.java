package music;


/*
 * the interface that all vivoiditor have to implement
 */
public interface Visitor {
	public void visit(Song s);
	public void visit(Header h);
	public void visit(Body b); 
	public void visit(Voice v);
	public void visit(Measure m);
	public void visit(Note n);
	public void visit(Chord c);
	public void visit(Tuplet t);
	public void visit(Rest r);
}
