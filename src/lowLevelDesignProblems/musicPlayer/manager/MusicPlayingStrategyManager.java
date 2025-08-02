package lowLevelDesignProblems.musicPlayer.manager;

import lowLevelDesignProblems.musicPlayer.enums.MusicPlayingStrategyType;
import lowLevelDesignProblems.musicPlayer.factory.MusicPlayingStrategyFactory;
import lowLevelDesignProblems.musicPlayer.strategy.MusicPlayingStrategy;

public class MusicPlayingStrategyManager {

    private static MusicPlayingStrategyManager musicPlayingStrategyManager;

    public static MusicPlayingStrategyManager getInstance(){
        if(musicPlayingStrategyManager == null){
            synchronized (MusicPlayingStrategyManager.class){
                if(musicPlayingStrategyManager == null){
                    musicPlayingStrategyManager = new MusicPlayingStrategyManager();
                }
            }
        }
        return musicPlayingStrategyManager;
    }

    public MusicPlayingStrategy getPlayingStrategy(MusicPlayingStrategyType strategyType){
        return MusicPlayingStrategyFactory.getMusicPlayingStrategy(strategyType);
    }
}
