import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public SongIterator iterator() {
        return new PlaylistIterator(songs);
    }

    public SongIterator reverseIterator() {
        return new ReversePlaylistIterator(songs);
    }
}