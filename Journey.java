class Journey {

    public static void main(String[] args) {

       
        boolean bookingStatus;
        double totalExpense;
        String destinationName;
        int groupSize;
        char packageLevel;

       
        bookingStatus = true;
        totalExpense = 25000.75;
        destinationName = "Manali";
        groupSize = 5;
        packageLevel = 'A';

        
        System.out.println("Booking Status: " + bookingStatus);
        System.out.println("Total Expense: " + totalExpense);
        System.out.println("Destination Name: " + destinationName);
        System.out.println("Group Size: " + groupSize);
        System.out.println("Package Level: " + packageLevel);

        
        bookingStatus = false;
        totalExpense = 18000.50;
        destinationName = "Ooty";
        groupSize = 3;
        packageLevel = 'B';

       
        System.out.println("---- After Changing Values ----");

        System.out.println("Booking Status: " + bookingStatus);
        System.out.println("Total Expense: " + totalExpense);
        System.out.println("Destination Name: " + destinationName);
        System.out.println("Group Size: " + groupSize);
        System.out.println("Package Level: " + packageLevel);
    }
}