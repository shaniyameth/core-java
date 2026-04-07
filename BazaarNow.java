class BazaarNow {

    // Method 1
    static double setInfo(String foodName) {
        double foodPrice = 0;

        if (foodName == "Pizza") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 250.5;

        } else if (foodName == "Burger") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 120.0;

        } else if (foodName == "Pasta") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 180.75;

        } else if (foodName == "Sandwich") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 90.25;

        } else if (foodName == "Noodles") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 110.5;

        } else if (foodName == "Fried Rice") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 130.0;

        } else if (foodName == "Biryani") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 220.0;

        } else if (foodName == "Dosa") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 80.0;

        } else if (foodName == "Idli") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 50.0;

        } else if (foodName == "Ice Cream") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 70.5;

        } else {
            System.out.println("Food item not available");
        }

        return foodPrice;
    }

    // Method 2
    static double setInfo(String foodName, double foodPrice, double quantity) {
        double totalBill = 0;

        if (foodName == "Pizza") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Burger") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Pasta") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Sandwich") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Noodles") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Fried Rice") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Biryani") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Dosa") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Idli") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Ice Cream") {
            totalBill = foodPrice * quantity;

        } else {
            System.out.println("Invalid food item");
        }

        return totalBill;
    }

    public static void main(String[] args) {

        double price = BazaarNow.setInfo("Pizza");
        System.out.println("Price of one item: " + price);

        double total = BazaarNow.setInfo("Pizza", price, 2);
        System.out.println("Total bill: " + total);
    }
}