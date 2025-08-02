package lowLevelDesignProblems.musicPlayer;

import lowLevelDesignProblems.musicPlayer.enums.AudioDeviceType;
import lowLevelDesignProblems.musicPlayer.enums.MusicPlayingStrategyType;
import lowLevelDesignProblems.musicPlayer.factory.MusicPlayingStrategyFactory;
import lowLevelDesignProblems.musicPlayer.manager.AudioDeviceManager;
import lowLevelDesignProblems.musicPlayer.model.Song;
import lowLevelDesignProblems.musicPlayer.outputDevice.IOutputDevice;
import lowLevelDesignProblems.musicPlayer.strategy.MusicPlayingStrategy;

public class MusicPlayerFacade {
    private MusicPlayingStrategyFactory strategyFactory;
    private AudioEngine audioEngine;
    private IOutputDevice outputDevice;
    private MusicPlayingStrategy musicPlayingStrategy;
    MusicPlayerFacade(AudioEngine audioEngine){
        this.audioEngine = audioEngine;
    }
    public void connectAudioOutputDevice(AudioDeviceType deviceType){
        outputDevice = AudioDeviceManager.getInstance().getOutputDevice(deviceType);
    }

    public void playSong(Song song){
        audioEngine.playSong(outputDevice,song);
    }
    public void pauseSong(Song song){
        audioEngine.pauseSong(song);
    }
    public void selectPlayingStrategy(MusicPlayingStrategyType strategyType){
        musicPlayingStrategy = MusicPlayingStrategyFactory.getMusicPlayingStrategy(strategyType);
    }


    public MusicPlayingStrategyFactory getStrategyFactory() {
        return strategyFactory;
    }

    public void setStrategyFactory(MusicPlayingStrategyFactory strategyFactory) {
        this.strategyFactory = strategyFactory;
    }

    public AudioEngine getAudioEngine() {
        return audioEngine;
    }

    public void setAudioEngine(AudioEngine audioEngine) {
        this.audioEngine = audioEngine;
    }

    public IOutputDevice getOutputDevice() {
        return outputDevice;
    }

    public void setOutputDevice(IOutputDevice outputDevice) {
        this.outputDevice = outputDevice;
    }

    public MusicPlayingStrategy getMusicPlayingStrategy() {
        return musicPlayingStrategy;
    }

    public void setMusicPlayingStrategy(MusicPlayingStrategy musicPlayingStrategy) {
        this.musicPlayingStrategy = musicPlayingStrategy;
    }
}
