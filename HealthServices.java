class HealthServices {

    public static void main(String[] args) {

        
        double rating;
        int numberOfDoctors;
        boolean isOpen;
        char category;
        String hospitalName;

       
        rating = 4.5;
        numberOfDoctors = 45;
        isOpen = true;
        category = 'A';
        hospitalName = "City Care";

        
        System.out.println("Rating: " + rating);
        System.out.println("Number of Doctors: " + numberOfDoctors);
        System.out.println("Open: " + isOpen);
        System.out.println("Category: " + category);
        System.out.println("Hospital Name: " + hospitalName);

       s
        rating = 4.8;
        numberOfDoctors = 60;
        isOpen = false;
        category = 'S';
        hospitalName = "Metro Health";

        System.out.println("---- After Changing Values ----");

        System.out.println("Rating: " + rating);
        System.out.println("Number of Doctors: " + numberOfDoctors);
        System.out.println("Open: " + isOpen);
        System.out.println("Category: " + category);
        System.out.println("Hospital Name: " + hospitalName);
    }
}