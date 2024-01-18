package day11;

public class TVMain {

	public static void main(String[] args) {

		TV tv = new TV();

		tv.channel = 5;
		tv.color = "red";

		tv.channelUp();
		tv.channelUp();
		tv.chnnelDown();

		System.out.println("채널번호 : " + tv.channel);
		System.out.println("채널색깔 : " + tv.color);

		TV tv1 = new TV(30, "blue");
		tv1.channelUp();
		tv.channelUp();
		System.out.println("채널번호 : " + tv1.channel);
		System.out.println("채널색깔 : " + tv1.color);
		
		TV tv2 = new TV(65 , "Yellow");
		tv2.channelUp();
		System.out.println(tv2.color);
		System.out.println(tv2.channel);
		
		tv.showChannel();
	}

}
