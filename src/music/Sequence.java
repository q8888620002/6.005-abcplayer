package music;

import sound.SequencePlayer;

public interface Sequence{
		public SequencePlayer accept(Visitor s);
}

