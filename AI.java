class AI{
	public static void main(String [] args){
		
	startingMessage();
	System.out.println("What's the Weather Today");
	todayweather();
	System.out.println("Ok, then Add the given values:");
	int valueOne = 60;
	int valueTwo = 40;
	toAddValues(valueOne, valueTwo);
	System.out.println("What's the Price of Silver?");
	int silverprice = priceOfSilver();
	int Goldprice = priceOfGold();
	System.out.println(Goldprice);
	System.out.println(silverprice);
	}
	static void startingMessage(){
		System.out.println("Hello Shan How can I help You.");
	}
	static void todayweather(){
		System.out.println("So, Today's Weather is Sunny");
		
	}
	static void toAddValues(int valueOne, int valueTwo){
		int totalvalue = valueOne + valueTwo ;
	    System.out.println("Ok, So the total value of the given values is "+totalvalue);	
    }
	static int priceOfSilver(){
		System.out.println("The price of silver is");
		int price = 295;
		return price;
		
	}
	static void priceOfGold(){
		System.out.println("The price of Gold is");
		int price = 15000;
		return price;
	}
}
