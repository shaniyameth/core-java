class WaterTank {

   
    static void setTank() {
		System.out.println("ASHIRVAD WATER TANK");
        System.out.println("Water tank system started...");
    }

    static void addWater(int num1, int num2, String type) {
        System.out.println("Adding water levels...");
        int total = num1 + num2;
		System.out.println("total water levels water levels...");
        System.out.println(total);
        System.out.println(type);
    }

    static double getTankCapacity() {
        System.out.println("Checking tank capacity...");
        double capacity = 1500.50;
        System.out.println("Capacity found I LITER");
        return capacity;
    }
	static double addPrice(double price,double tax){
	double total=price+tax;
	System.out.println("total price of the tank");
	System.out.println(total);
	return total;
	
	}
}