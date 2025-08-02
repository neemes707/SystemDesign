package lowLevelDesignProblems.musicPlayer;

import lowLevelDesignProblems.musicPlayer.enums.AudioDeviceType;
import lowLevelDesignProblems.musicPlayer.enums.MusicPlayingStrategyType;
import lowLevelDesignProblems.musicPlayer.model.Song;

/**Ideally this class should be singleton but we have skipped this
 * facade class should also be singleton*/
public class MusicPlayerApplication {
    private MusicPlayerFacade musicPlayerFacade;
    public MusicPlayerApplication(MusicPlayerFacade facade){
        this.musicPlayerFacade = facade;
    }
    public Song createSong(String songName,String artistName,String path){
        return new Song(songName,artistName,path);
    }

    public void connectOutputDevice(AudioDeviceType audioDeviceType){
        musicPlayerFacade.connectAudioOutputDevice(audioDeviceType);
    }
    public void selectStrategy(MusicPlayingStrategyType musicPlayingStrategyType){
        musicPlayerFacade.selectPlayingStrategy(musicPlayingStrategyType);
    }

    public void playSong(Song song){
        musicPlayerFacade.playSong(song);
    }



}
