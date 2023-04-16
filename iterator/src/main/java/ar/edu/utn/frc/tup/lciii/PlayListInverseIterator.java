package ar.edu.utn.frc.tup.lciii;

import java.util.Iterator;

public class PlayListInverseIterator implements Iterator<Song> {

    private PlayList playList;
    private Integer index;

    public PlayListInverseIterator(PlayList playList) {
        this.playList = playList;
        this.index = this.playList.getSongList().size() -1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Song next() {
        return playList.getSongList().get(index--);
    }
}
