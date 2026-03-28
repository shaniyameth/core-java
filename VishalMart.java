class VishalMart {   
    static void openStore() {
		System.out.println("IT IS A SHOPING MART");
        System.out.println("VishalMart store is now open...");
    }

    static void addProducts(int product1, int product2, String section) {
        System.out.println("Adding product quantities...");
        int total = product1 + product2;
        System.out.println(total);
        System.out.println(section);
    }

    static double getDailySales() {
        System.out.println("Checking daily sales...");
        double amount = 12500.75;
        System.out.println("Sales amount found");
        return amount;
    }
	
	static int noOfStaffs(int boys,int girls){
	System.out.println("staffs i vishal mega mart");
	int staffs=boys+girls;
	System.out.println("total no of staffs are");
	System.out.println(staffs);
	return staffs;
	}
}