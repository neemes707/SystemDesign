package lowLevelDesignProblems.musicPlayer.outputDevice;

import lowLevelDesignProblems.musicPlayer.model.Song;

public interface IOutputDevice {
    void playSong(Song song);
}
