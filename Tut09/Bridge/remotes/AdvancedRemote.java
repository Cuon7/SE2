package Tut09.Bridge.remotes;

import Tut09.Bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    //TO-DO: Implement the mute() method
    public void mute() {
    	//Display the current volume status is 'mute'
         
        //Set the volume to 0
        System.out.println("Remote: mute");
        device.setVolume(0);    
    }
}
