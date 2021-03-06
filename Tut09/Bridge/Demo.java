package Tut09.Bridge;

import Tut09.Bridge.devices.Device;
import Tut09.Bridge.devices.Radio;
import Tut09.Bridge.devices.Tv;
import Tut09.Bridge.remotes.AdvancedRemote;
import Tut09.Bridge.remotes.BasicRemote;

public class Demo {
	public static void main(String[] args) {
		testDevice(new Tv());
		testDevice(new Radio());
	}

	//TO-DO: Implement the method testDevice()
	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		//Create the new BasicRemote instance
                BasicRemote bs = new BasicRemote(device);
		//Power on the device
                bs.power();
		//Display the status of device
                device.printStatus();
		 

		System.out.println("Tests with advanced remote.");
		//Create the new AdvancedRemote instance
                AdvancedRemote ar = new AdvancedRemote(device);
		//Power on the device
		ar.power();
		//Mute the device
		ar.mute();
		//Display the status of device
		device.printStatus();
	}
}
