package ar.edu.utn.frc.tup.lciii;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
public class PlayList implements Iterable<Song> {

    private List<Song> songList;

    public PlayList() {
        this.songList = new ArrayList<>();
    }

    public void addSong(Song song) {
        songList.add(song);
    }

    @Override
    public Iterator<Song> iterator() {
        return new PlayListIterator(this);
    }

    public Iterator<Song> iverseIterator() {
        return new PlayListInverseIterator(this);
    }
}
