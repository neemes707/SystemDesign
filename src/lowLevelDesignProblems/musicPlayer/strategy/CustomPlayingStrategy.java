package lowLevelDesignProblems.musicPlayer.strategy;

public class CustomPlayingStrategy implements MusicPlayingStrategy{
    @Override
    public void play() {
        System.out.println("Playing music in some custom way");
    }
}
