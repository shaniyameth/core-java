class FoodPanda {

    // Method 1
    static float checkDetails(String foodItem) {
        float itemPrice = 0;

        if (foodItem == "Biryani") {
            System.out.println("Food selected: " + foodItem);
            itemPrice = 260.5f;

        } else if (foodItem == "Pizza") {
            System.out.println("Food selected: " + foodItem);
            itemPrice = 320.0f;

        } else if (foodItem == "Burger") {
            System.out.println("Food selected: " + foodItem);
            itemPrice = 140.5f;

        } else if (foodItem == "Pasta") {
            System.out.println("Food selected: " + foodItem);
            itemPrice = 190.0f;

        } else if (foodItem == "Noodles") {
            System.out.println("Food selected: " + foodItem);
            itemPrice = 160.5f;

        } else if (foodItem == "FriedRice") {
            System.out.println("Food selected: " + foodItem);
            itemPrice = 150.0f;

        } else if (foodItem == "Sandwich") {
            System.out.println("Food selected: " + foodItem);
            itemPrice = 110.5f;

        } else if (foodItem == "Roll") {
            System.out.println("Food selected: " + foodItem);
            itemPrice = 135.0f;

        } else if (foodItem == "IceCream") {
            System.out.println("Food selected: " + foodItem);
            itemPrice = 95.5f;

        } else if (foodItem == "Juice") {
            System.out.println("Food selected: " + foodItem);
            itemPrice = 85.0f;

        } else {
            System.out.println("Food item not available");
        }

        return itemPrice;
    }

    // Method 2
    static float checkDetails(String foodItem, float itemPrice, float quantity) {
        float totalBill = 0;

        if (foodItem == "Biryani") {
            totalBill = itemPrice * quantity;

        } else if (foodItem == "Pizza") {
            totalBill = itemPrice * quantity;

        } else if (foodItem == "Burger") {
            totalBill = itemPrice * quantity;

        } else if (foodItem == "Pasta") {
            totalBill = itemPrice * quantity;

        } else if (foodItem == "Noodles") {
            totalBill = itemPrice * quantity;

        } else if (foodItem == "FriedRice") {
            totalBill = itemPrice * quantity;

        } else if (foodItem == "Sandwich") {
            totalBill = itemPrice * quantity;

        } else if (foodItem == "Roll") {
            totalBill = itemPrice * quantity;

        } else if (foodItem == "IceCream") {
            totalBill = itemPrice * quantity;

        } else if (foodItem == "Juice") {
            totalBill = itemPrice * quantity;

        } else {
            System.out.println("Invalid order");
        }

        return totalBill;
    }

    public static void main(String[] args) {

        float price = FoodPanda.checkDetails("Biryani");
        System.out.println("Price of one item: " + price);

        float total = FoodPanda.checkDetails("Biryani", price, 2f);
        System.out.println("Total amount: " + total);
    }
}