package lowLevelDesignProblems.musicPlayer.strategy;

public class RandomPlayingStrategy implements MusicPlayingStrategy{
    @Override
    public void play() {
        System.out.println("Playing song in random way");
    }
}
