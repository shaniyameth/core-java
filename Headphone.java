class Headphone{
	
	static void brand(){
		System.out.println("Name of Brand: UNIX" );
	}
	
	static void customerName(String name){
		System.out.println("Customer Name: "+name);
	}
	
	static double priceOfHeadphone(){
		double price = 2500.00;
		return price;
	}
	
	static int numberOfHeadphoneOrdered(int customerOne , int customerTwo){
		int headphoneOrder = customerOne + customerTwo;
		return headphoneOrder;
	}
	
}