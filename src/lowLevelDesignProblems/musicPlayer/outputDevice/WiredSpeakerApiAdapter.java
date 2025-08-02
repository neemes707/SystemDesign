package lowLevelDesignProblems.musicPlayer.outputDevice;

import lowLevelDesignProblems.musicPlayer.model.Song;
import lowLevelDesignProblems.musicPlayer.externalDevice.WiredSpeakerAPI;

public class WiredSpeakerApiAdapter implements IOutputDevice{
    private WiredSpeakerAPI wiredSpeakerAPI;

    public WiredSpeakerApiAdapter(WiredSpeakerAPI wiredSpeakerAPI) {
        this.wiredSpeakerAPI = wiredSpeakerAPI;
    }

    @Override
    public void playSong(Song song) {
        wiredSpeakerAPI.playAudio(song.getPath());
    }

    public WiredSpeakerAPI getWiredSpeakerAPI() {
        return wiredSpeakerAPI;
    }

    public void setWiredSpeakerAPI(WiredSpeakerAPI wiredSpeakerAPI) {
        this.wiredSpeakerAPI = wiredSpeakerAPI;
    }
}
