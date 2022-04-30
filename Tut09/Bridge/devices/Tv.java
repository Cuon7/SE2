package Tut09.Bridge.devices;

public class Tv implements Device {
	private boolean on = false;
	private int volume = 30;
	private int channel = 1;

	@Override
	public boolean isEnabled() {
		return on;
	}

	@Override
	public void enable() {
		on = true;
	}

	@Override
	public void disable() {
		on = false;
	}

	//TO-DO: Implement getVolume() method
	@Override
	public int getVolume() {
		return volume;
	}

	//TO-DO: Implement setVolume() method
	@Override
	public void setVolume(int volume) {
		//use 'if-elseif-else' structure to limit the volume from 0 to 100
		//outside the range is invalid
	    if (volume > 100) {
                this.volume = 100;
            } else if (volume < 0) {
                this.volume = 0;
            } else {
                this.volume = volume;
            }
	}

	//TO-DO: Implement getChannel() method
	@Override
	public int getChannel() {
            return channel;
	}

	//TO-DO: Implement setChannel() method
	@Override
	public void setChannel(int channel) {
            this.channel = channel;
	}

	@Override
	public void printStatus() {
		//Show the current device is TV
		
		//Show the current status: enabled or disabled
		
		//Show the current volume
		
		//Show the current channel
        System.out.println("------------------------------------");
        System.out.println("| I'm TV set.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
	}
}
