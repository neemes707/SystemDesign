package lowLevelDesignProblems.musicPlayer.factory;

import lowLevelDesignProblems.musicPlayer.enums.MusicPlayingStrategyType;
import lowLevelDesignProblems.musicPlayer.strategy.CustomPlayingStrategy;
import lowLevelDesignProblems.musicPlayer.strategy.MusicPlayingStrategy;
import lowLevelDesignProblems.musicPlayer.strategy.RandomPlayingStrategy;
import lowLevelDesignProblems.musicPlayer.strategy.SequentialPlayingStrategy;

public class MusicPlayingStrategyFactory {
    public static MusicPlayingStrategy getMusicPlayingStrategy(MusicPlayingStrategyType strategyType){
        if(strategyType == MusicPlayingStrategyType.SEQUENTIAL){
            return new SequentialPlayingStrategy();
        } else if (strategyType == MusicPlayingStrategyType.RANDOM) {
            return new RandomPlayingStrategy();
        } else if(strategyType == MusicPlayingStrategyType.CUSTOM){
            return new CustomPlayingStrategy();
        }
        return null;
    }
}
