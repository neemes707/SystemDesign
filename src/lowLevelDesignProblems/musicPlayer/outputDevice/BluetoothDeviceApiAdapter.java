package lowLevelDesignProblems.musicPlayer.outputDevice;

import lowLevelDesignProblems.musicPlayer.model.Song;
import lowLevelDesignProblems.musicPlayer.externalDevice.BluetoothDeviceAPI;

public class BluetoothDeviceApiAdapter implements IOutputDevice{
    private BluetoothDeviceAPI bluetoothDeviceAPI;

    public BluetoothDeviceApiAdapter(BluetoothDeviceAPI bluetoothDeviceAPI) {
        this.bluetoothDeviceAPI = bluetoothDeviceAPI;
    }

    @Override
    public void playSong(Song song) {
        bluetoothDeviceAPI.playAudio(song.getPath());
    }

    public BluetoothDeviceAPI getBluetoothDeviceAPI() {
        return bluetoothDeviceAPI;
    }

    public void setBluetoothDeviceAPI(BluetoothDeviceAPI bluetoothDeviceAPI) {
        this.bluetoothDeviceAPI = bluetoothDeviceAPI;
    }
}
