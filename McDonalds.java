class McDonalds {

    // Method 1
    static int orderDetails(String foodName) {
        int foodPrice = 0;

        if (foodName == "Burger") {
            System.out.println("Ordered item: " + foodName);
            foodPrice = 120;

        } else if (foodName == "Fries") {
            System.out.println("Ordered item: " + foodName);
            foodPrice = 80;

        } else if (foodName == "Pizza McPuff") {
            System.out.println("Ordered item: " + foodName);
            foodPrice = 100;

        } else if (foodName == "McAloo Tikki") {
            System.out.println("Ordered item: " + foodName);
            foodPrice = 60;

        } else if (foodName == "McChicken") {
            System.out.println("Ordered item: " + foodName);
            foodPrice = 150;

        } else if (foodName == "Veg Wrap") {
            System.out.println("Ordered item: " + foodName);
            foodPrice = 130;

        } else if (foodName == "Chicken Nuggets") {
            System.out.println("Ordered item: " + foodName);
            foodPrice = 170;

        } else if (foodName == "Coke") {
            System.out.println("Ordered item: " + foodName);
            foodPrice = 50;

        } else if (foodName == "Ice Cream") {
            System.out.println("Ordered item: " + foodName);
            foodPrice = 40;

        } else if (foodName == "Coffee") {
            System.out.println("Ordered item: " + foodName);
            foodPrice = 70;

        } else {
            System.out.println("Item not available");
        }

        return foodPrice;
    }

    // Method 2
    static int orderDetails(String foodName, int foodPrice, int quantity) {
        int totalBill = 0;

        if (foodName == "Burger") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Fries") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Pizza McPuff") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "McAloo Tikki") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "McChicken") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Veg Wrap") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Chicken Nuggets") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Coke") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Ice Cream") {
            totalBill = foodPrice * quantity;

        } else if (foodName == "Coffee") {
            totalBill = foodPrice * quantity;

        } else {
            System.out.println("Invalid order");
        }

        return totalBill;
    }

    public static void main(String[] args) {

        int price = McDonalds.orderDetails("Burger");
        System.out.println("Price of one item: " + price);

        int total = McDonalds.orderDetails("Burger", price, 3);
        System.out.println("Total bill: " + total);
    }
}