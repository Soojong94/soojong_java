package day11;

public class TV {

	
	int channel ;
	String color;
	
	public TV() {
		
	}
	
	public TV(int channel, String color) {
		super();
		this.channel = channel;
		this.color = color;
	}
	
	
	public void channelUp() {
		channel++; 
		
	}public void chnnelDown() {
		channel--;
	}
	public void showChannel() {
		System.out.print(channel);
	}
}
