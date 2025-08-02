package lowLevelDesignProblems.musicPlayer;

import lowLevelDesignProblems.musicPlayer.enums.AudioDeviceType;
import lowLevelDesignProblems.musicPlayer.enums.MusicPlayingStrategyType;
import lowLevelDesignProblems.musicPlayer.model.Song;

/** For easy implementation we have not made use of song playing strategies available. Only use of song playing strategies
 * will be to give a next song to the music player application so that we can play that song */
public class MusicPlayerTesting {
    public static void main(String[] args) {

        MusicPlayerFacade facade = new MusicPlayerFacade(new AudioEngine());
        MusicPlayerApplication musicPlayerApplication = new MusicPlayerApplication(facade);

        musicPlayerApplication.connectOutputDevice(AudioDeviceType.HEADPHONE);
        musicPlayerApplication.selectStrategy(MusicPlayingStrategyType.SEQUENTIAL);


        Song song = musicPlayerApplication.createSong("abc", "xyz", "c/home/songs");
        musicPlayerApplication.playSong(song);


    }
}
