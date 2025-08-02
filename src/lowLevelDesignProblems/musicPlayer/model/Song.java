package lowLevelDesignProblems.musicPlayer.model;

public class Song {
    private String name;
    private String artistName;
    private String path;

    public Song(String name, String artistName, String path) {
        this.name = name;
        this.artistName = artistName;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
