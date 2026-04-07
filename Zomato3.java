class Zomato3 {

    // Method 1
    static float checkDetails(String dishName) {
        float dishPrice = 0;

        if (dishName == "Biryani") {
            System.out.println("Dish selected: " + dishName);
            dishPrice = 250.5f;

        } else if (dishName == "Pizza") {
            System.out.println("Dish selected: " + dishName);
            dishPrice = 300.0f;

        } else if (dishName == "Burger") {
            System.out.println("Dish selected: " + dishName);
            dishPrice = 120.5f;

        } else if (dishName == "Pasta") {
            System.out.println("Dish selected: " + dishName);
            dishPrice = 180.0f;

        } else if (dishName == "Noodles") {
            System.out.println("Dish selected: " + dishName);
            dishPrice = 150.5f;

        } else if (dishName == "FriedRice") {
            System.out.println("Dish selected: " + dishName);
            dishPrice = 140.0f;

        } else if (dishName == "Sandwich") {
            System.out.println("Dish selected: " + dishName);
            dishPrice = 100.5f;

        } else if (dishName == "Roll") {
            System.out.println("Dish selected: " + dishName);
            dishPrice = 130.0f;

        } else if (dishName == "IceCream") {
            System.out.println("Dish selected: " + dishName);
            dishPrice = 90.5f;

        } else if (dishName == "Juice") {
            System.out.println("Dish selected: " + dishName);
            dishPrice = 80.0f;

        } else {
            System.out.println("Dish not available");
        }

        return dishPrice;
    }

    // Method 2
    static float checkDetails(String dishName, float dishPrice, float quantity) {
        float totalValue = 0;

        if (dishName == "Biryani") {
            totalValue = dishPrice * quantity;

        } else if (dishName == "Pizza") {
            totalValue = dishPrice * quantity;

        } else if (dishName == "Burger") {
            totalValue = dishPrice * quantity;

        } else if (dishName == "Pasta") {
            totalValue = dishPrice * quantity;

        } else if (dishName == "Noodles") {
            totalValue = dishPrice * quantity;

        } else if (dishName == "FriedRice") {
            totalValue = dishPrice * quantity;

        } else if (dishName == "Sandwich") {
            totalValue = dishPrice * quantity;

        } else if (dishName == "Roll") {
            totalValue = dishPrice * quantity;

        } else if (dishName == "IceCream") {
            totalValue = dishPrice * quantity;

        } else if (dishName == "Juice") {
            totalValue = dishPrice * quantity;

        } else {
            System.out.println("Invalid dish");
        }

        return totalValue;
    }

    public static void main(String[] args) {

        float price = Zomato.checkDetails("Pizza");
        System.out.println("Price of one dish: " + price);

        float total = Zomato.checkDetails("Pizza", price, 3f);
        System.out.println("Total amount: " + total);
    }
}