package lowLevelDesignProblems.musicPlayer.outputDevice;

import lowLevelDesignProblems.musicPlayer.model.Song;
import lowLevelDesignProblems.musicPlayer.externalDevice.HeadPhoneAPI;

public class HeadphoneApiAdapter implements IOutputDevice {
    private HeadPhoneAPI headPhoneAPI;

    public HeadphoneApiAdapter(HeadPhoneAPI headPhoneAPI) {
        this.headPhoneAPI = headPhoneAPI;
    }

    public HeadPhoneAPI getHeadPhoneAPI() {
        return headPhoneAPI;
    }

    public void setHeadPhoneAPI(HeadPhoneAPI headPhoneAPI) {
        this.headPhoneAPI = headPhoneAPI;
    }

    @Override
    public void playSong(Song song) {
        headPhoneAPI.playAudio();
    }
}
