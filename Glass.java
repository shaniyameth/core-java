class Glass{
	
	
    
    static void countGlass() {
		System.out.println("juice glass");
        System.out.println("Glass is ready to fill...");
    }
	static boolean setType(boolean isPlastic){
	System.out.println("it is a plastic glass:"+isPlastic );
	return isPlastic;
	}
	
    static void addJuice(int amount1, int amount2, String juice) {
        System.out.println("Adding juice quantities...");
        int total = amount1 + amount2;
        System.out.println(total);
        System.out.println(juice);
    }
    static double getGlassCapacity() {
        System.out.println("Checking glass capacity...");
        double capacity = 350.75;
        System.out.println("Capacity found");
        return capacity;
    }
}