class WallClock{
	public static void main(String[] args){
		int price ;
		price = -2147483647;
		System.out.println("Min value of int data type:"+price);
		int price1 ;
		price1 = 2147483647;
		System.out.println("Max value of int data type:"+price1);
		short hours;
		hours = -32768;
		System.out.println("Min value of short data type:"+hours);
		short hours1;
		hours1 = 32767;
		System.out.println("Max value of short data type:"+hours1);
		long minutes;
        minutes	= -9223372036854775807L;
		System.out.println("Min value of long data type:"+minutes);
		long minutes1;
        minutes1= 9223372036854775807L;
		System.out.println("Min value of long data type:"+minutes1);
		byte seconds;
		seconds = -127;
		System.out.println("Min value of byte data type:"+seconds);
		byte seconds1;
		seconds1 = 127;
		System.out.println("Max value of byte data type:"+seconds1);
		float screenSize;
		screenSize = -1.40125678f;
		System.out.println("Min value of float data type:"+screenSize);
		float screenSize1;
		screenSize1 = 1.40125678f;
		System.out.println("Min value of float data type:"+screenSize1);
		double batteryCapacity;
		batteryCapacity = -9.1234567890987654321;
		System.out.println("Min value of double data type:"+batteryCapacity);
		double batteryCapacity1;
		batteryCapacity1 = 9.1234567890987654321;
		System.out.println("Min value of double data type:"+batteryCapacity1);
		char rating;
        rating = 'A';
		System.out.println(rating);
		boolean isWorking;
		isWorking = true ;
		System.out.println(isWorking);
	}
}