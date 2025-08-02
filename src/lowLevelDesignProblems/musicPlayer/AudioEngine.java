package lowLevelDesignProblems.musicPlayer;

import lowLevelDesignProblems.musicPlayer.model.Song;
import lowLevelDesignProblems.musicPlayer.outputDevice.IOutputDevice;

public class AudioEngine {
    private Song currentSong;
    public void playSong(IOutputDevice outputDevice, Song song){
        currentSong = song;
        outputDevice.playSong(song);
    }
    public void pauseSong(Song song){
        if(this.currentSong == song){
            System.out.println("Song paused");
        }else{
            System.out.println("Current song playing and song asked to pause are different so can't pause song");
        }
    }

}
