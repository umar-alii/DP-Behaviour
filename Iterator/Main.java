public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song A", "Artist 1"));
        playlist.addSong(new Song("Song B", "Artist 2"));
        playlist.addSong(new Song("Song C", "Artist 3"));

        System.out.println("Forward Iteration:");
        SongIterator iterator = playlist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nReverse Iteration:");
        SongIterator reverseIterator = playlist.reverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}