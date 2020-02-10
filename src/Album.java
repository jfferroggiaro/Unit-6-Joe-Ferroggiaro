public class Album {
    private String title;
    private String artist;
    private int numTracks;
    private double playTime;

    public Album(String title, String artist, int numTracks, double playTime){
        this.title = title;
        this.artist = artist;
        this.numTracks = numTracks;
        this.playTime = playTime;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        String albumPrint = "";
        albumPrint += title + " by " + artist + "\n";
        albumPrint += numTracks + " tracks - " + playTime + " minutes";
        return albumPrint;
    }
}
