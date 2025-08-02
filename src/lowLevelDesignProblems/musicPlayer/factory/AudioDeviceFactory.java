package lowLevelDesignProblems.musicPlayer.factory;

import lowLevelDesignProblems.musicPlayer.enums.AudioDeviceType;
import lowLevelDesignProblems.musicPlayer.externalDevice.BluetoothDeviceAPI;
import lowLevelDesignProblems.musicPlayer.externalDevice.HeadPhoneAPI;
import lowLevelDesignProblems.musicPlayer.externalDevice.WiredSpeakerAPI;
import lowLevelDesignProblems.musicPlayer.outputDevice.BluetoothDeviceApiAdapter;
import lowLevelDesignProblems.musicPlayer.outputDevice.HeadphoneApiAdapter;
import lowLevelDesignProblems.musicPlayer.outputDevice.IOutputDevice;
import lowLevelDesignProblems.musicPlayer.outputDevice.WiredSpeakerApiAdapter;

public class AudioDeviceFactory {

    /** This method return an adapter of appropriate type and also sets appropriate external device API object reference
     * in that adapter */
    public static IOutputDevice getOutputDevice(AudioDeviceType deviceType){
        if(deviceType == AudioDeviceType.HEADPHONE){
            return new HeadphoneApiAdapter(new HeadPhoneAPI());
        } else if (deviceType == AudioDeviceType.WIRED_SPEAKER) {
            return new WiredSpeakerApiAdapter(new WiredSpeakerAPI());
        } else if (deviceType == AudioDeviceType.BLUETOOTH_SPEAKER){
            return new BluetoothDeviceApiAdapter(new BluetoothDeviceAPI());
        }
        return null;
    }
}
