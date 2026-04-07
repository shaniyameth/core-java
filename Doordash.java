class Doordash {

    // Method 1
    static int orderDetails(String foodName) {
        int foodPrice = 0;

        if (foodName == "Pizza") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 200;

        } else if (foodName == "Burger") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 120;

        } else if (foodName == "Pasta") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 180;

        } else if (foodName == "Sandwich") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 100;

        } else if (foodName == "Fries") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 90;

        } else if (foodName == "Noodles") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 150;

        } else if (foodName == "Biryani") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 250;

        } else if (foodName == "Roll") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 130;

        } else if (foodName == "IceCream") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 80;

        } else if (foodName == "Juice") {
            System.out.println("Food selected: " + foodName);
            foodPrice = 70;

        } else {
            System.out.println("Food item not available");
        }

        return foodPrice;
    }

    // Method 2
    static int orderDetails(String foodName, int foodPrice, int quantity) {
        int totalAmount = 0;

        if (foodName == "Pizza") {
            totalAmount = foodPrice * quantity;

        } else if (foodName == "Burger") {
            totalAmount = foodPrice * quantity;

        } else if (foodName == "Pasta") {
            totalAmount = foodPrice * quantity;

        } else if (foodName == "Sandwich") {
            totalAmount = foodPrice * quantity;

        } else if (foodName == "Fries") {
            totalAmount = foodPrice * quantity;

        } else if (foodName == "Noodles") {
            totalAmount = foodPrice * quantity;

        } else if (foodName == "Biryani") {
            totalAmount = foodPrice * quantity;

        } else if (foodName == "Roll") {
            totalAmount = foodPrice * quantity;

        } else if (foodName == "IceCream") {
            totalAmount = foodPrice * quantity;

        } else if (foodName == "Juice") {
            totalAmount = foodPrice * quantity;

        } else {
            System.out.println("Invalid order");
        }

        return totalAmount;
    }

    public static void main(String[] args) {

        int price = Doordash.orderDetails("Pizza");
        System.out.println("Price of one item: " + price);

        int total = Doordash.orderDetails("Pizza", price, 4);
        System.out.println("Total bill: " + total);
    }
}