package lowLevelDesignProblems.musicPlayer.strategy;

public class SequentialPlayingStrategy implements MusicPlayingStrategy{
    @Override
    public void play() {
        System.out.println("Playing song in sequential way");
    }
}
