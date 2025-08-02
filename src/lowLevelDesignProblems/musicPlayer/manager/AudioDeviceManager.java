package lowLevelDesignProblems.musicPlayer.manager;

import lowLevelDesignProblems.musicPlayer.enums.AudioDeviceType;
import lowLevelDesignProblems.musicPlayer.factory.AudioDeviceFactory;
import lowLevelDesignProblems.musicPlayer.outputDevice.IOutputDevice;
/** It will be a singleton class */
public class AudioDeviceManager {
    private IOutputDevice iOutputDevice;
    private static AudioDeviceManager audioDeviceManager;
    private AudioDeviceManager(){}
    public IOutputDevice getIOutputDevice() {
        return iOutputDevice;
    }

    public void setIOutputDevice(IOutputDevice iOutputDevice) {
        this.iOutputDevice = iOutputDevice;
    }

    public static AudioDeviceManager getInstance(){
        if(audioDeviceManager == null){
            synchronized (AudioDeviceManager.class){
                if(audioDeviceManager == null){
                    audioDeviceManager = new AudioDeviceManager();
                }
            }
        }
        return audioDeviceManager;
    }

    public IOutputDevice getOutputDevice(AudioDeviceType deviceType){
        return AudioDeviceFactory.getOutputDevice(deviceType);
    }

}
