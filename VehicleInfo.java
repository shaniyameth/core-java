class VehicleInfo {

    public static void main(String[] args) {

        boolean isAvailable;
        char fuelType;
        double price;
        String brand;
        int modelYear;

        isAvailable = true;
        fuelType = 'P';
        price = 850000.50;
        brand = "TATA";
        modelYear = 2022;

        System.out.println("Available: " + isAvailable);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Model Year: " + modelYear);

        isAvailable = false;
        fuelType = 'D';
        price = 920000.75;
        brand = "Toyota";
        modelYear = 2023;

        System.out.println("---- After Changing Values ----");

        System.out.println("Available: " + isAvailable);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Model Year: " + modelYear);
    }
}