class HomeMeter {

    public static void main(String[] args) {

        double monthlyBill;
        int unitsConsumed;
        boolean powerCut;
        String ownerName;
        char connectionType;

        
        monthlyBill = 2450.75;
        unitsConsumed = 320;
        powerCut = false;
        ownerName = "Ajay";
        connectionType = 'D';

    
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Monthly Bill: " + monthlyBill);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Power Cut Status: " + powerCut);

        
        monthlyBill = 1980.40;
        unitsConsumed = 275;
        powerCut = true;
        ownerName = "Raghu";
        connectionType = 'C';

        System.out.println("---- Updated Meter Details ----");

        System.out.println("Owner Name: " + ownerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Monthly Bill: " + monthlyBill);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Power Cut Status: " + powerCut);
    }
}