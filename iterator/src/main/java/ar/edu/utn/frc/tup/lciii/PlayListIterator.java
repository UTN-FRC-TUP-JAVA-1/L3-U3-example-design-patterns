package ar.edu.utn.frc.tup.lciii;

import lombok.Data;

import java.util.Iterator;


@Data
public class PlayListIterator implements Iterator<Song> {

    private PlayList playList;
    private Integer index;

    public PlayListIterator(PlayList playList) {
        this.playList = playList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < playList.getSongList().size();
    }

    @Override
    public Song next() {
        return playList.getSongList().get(index++);
    }
}
