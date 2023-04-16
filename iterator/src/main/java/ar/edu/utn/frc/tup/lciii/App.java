package ar.edu.utn.frc.tup.lciii;

import java.math.BigDecimal;
import java.util.Iterator;

/**
 * Iterator Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        PlayList playList = new PlayList();
        playList.addSong(new Song("Everything's Electric", "C'MON YOU KNOW (Delux Edition)", "Liam Gallagher", BigDecimal.valueOf(3.36)));
        playList.addSong(new Song("Afterlife", "Return of the dream canteen", "Red Hot Chilli Peppers", BigDecimal.valueOf(4.14)));
        playList.addSong(new Song("Pass the Nirvana", "Pass the Nirvana", "Pierce The Veil", BigDecimal.valueOf(3.17)));
        playList.addSong(new Song("Design", "Design", "Gustaf", BigDecimal.valueOf(2.36)));
        playList.addSong(new Song("Love Spreads", "Second Coming", "The Stone Roses", BigDecimal.valueOf(5.47)));

        Iterator<Song> iterator = playList.iterator();
        System.out.println("Playing in normal mode");
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println(song.toString());
        }

        Iterator<Song> inverseIterator = playList.iverseIterator();
        System.out.println();
        System.out.println("Playing in inverse mode");
        while (inverseIterator.hasNext()) {
            Song song = inverseIterator.next();
            System.out.println(song.toString());
        }
    }
}
