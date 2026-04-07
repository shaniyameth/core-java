class Dominos {

    // Method 1
    static double orderDetails(String itemName) {
        double itemCost = 0;

        if (itemName == "Margherita") {
            System.out.println("Selected pizza: " + itemName);
            itemCost = 120;

        } else if (itemName == "Farmhouse") {
            System.out.println("Selected pizza: " + itemName);
            itemCost = 220;

        } else if (itemName == "Peppy Paneer") {
            System.out.println("Selected pizza: " + itemName);
            itemCost = 250;

        } else if (itemName == "Veg Extravaganza") {
            System.out.println("Selected pizza: " + itemName);
            itemCost = 300;

        } else if (itemName == "Chicken Dominator") {
            System.out.println("Selected pizza: " + itemName);
            itemCost = 350;

        } else if (itemName == "Pepper Barbecue") {
            System.out.println("Selected pizza: " + itemName);
            itemCost = 280;

        } else if (itemName == "Cheese Burst") {
            System.out.println("Selected pizza: " + itemName);
            itemCost = 200;

        } else if (itemName == "Indi Tandoori") {
            System.out.println("Selected pizza: " + itemName);
            itemCost = 260;

        } else if (itemName == "Mexican Green Wave") {
            System.out.println("Selected pizza: " + itemName);
            itemCost = 240;

        } else if (itemName == "Deluxe Veggie") {
            System.out.println("Selected pizza: " + itemName);
            itemCost = 210;

        } else {
            System.out.println("Item not available");
        }

        return itemCost;
    }

    // Method 2
    static double orderDetails(String itemName, double itemCost, int quantity) {
        double totalAmount = 0;

        if (itemName == "Margherita") {
            totalAmount = itemCost * quantity;

        } else if (itemName == "Farmhouse") {
            totalAmount = itemCost * quantity;

        } else if (itemName == "Peppy Paneer") {
            totalAmount = itemCost * quantity;

        } else if (itemName == "Veg Extravaganza") {
            totalAmount = itemCost * quantity;

        } else if (itemName == "Chicken Dominator") {
            totalAmount = itemCost * quantity;

        } else if (itemName == "Pepper Barbecue") {
            totalAmount = itemCost * quantity;

        } else if (itemName == "Cheese Burst") {
            totalAmount = itemCost * quantity;

        } else if (itemName == "Indi Tandoori") {
            totalAmount = itemCost * quantity;

        } else if (itemName == "Mexican Green Wave") {
            totalAmount = itemCost * quantity;

        } else if (itemName == "Deluxe Veggie") {
            totalAmount = itemCost * quantity;

        } else {
            System.out.println("Invalid order");
        }

        return totalAmount;
    }

    public static void main(String[] args) {

        double cost = Dominos.orderDetails("Farmhouse");
        System.out.println("Price for one pizza: " + cost);

        double finalBill = Dominos.orderDetails("Farmhouse", cost, 3);
        System.out.println("Total bill: " + finalBill);
    }
}