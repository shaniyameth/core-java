class Travel {

    public static void main(String[] args) {

       
        int numberOfPeople;
        boolean isConfirmed;
        String placeName;
        char tripGrade;
        double budget;

       
        numberOfPeople = 4;
        isConfirmed = true;
        placeName = "Goa";
        tripGrade = 'A';
        budget = 30000.90;

       
        System.out.println("Number of People: " + numberOfPeople);
        System.out.println("Confirmed: " + isConfirmed);
        System.out.println("Place Name: " + placeName);
        System.out.println("Trip Grade: " + tripGrade);
        System.out.println("Budget: " + budget);

        
        numberOfPeople = 2;
        isConfirmed = false;
        placeName = "Mysore";
        tripGrade = 'B';
        budget = 15000.50;

        System.out.println("---- After Changing Values ----");

        System.out.println("Number of People: " + numberOfPeople);
        System.out.println("Confirmed: " + isConfirmed);
        System.out.println("Place Name: " + placeName);
        System.out.println("Trip Grade: " + tripGrade);
        System.out.println("Budget: " + budget);
    }
}