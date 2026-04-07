class Zepto {

    // Method 1
    static short getDetail(String itemName) {
        short itemPrice = 0;

        if (itemName == "Milk") {
            System.out.println("Item selected: " + itemName);
            itemPrice = 50;

        } else if (itemName == "Bread") {
            System.out.println("Item selected: " + itemName);
            itemPrice = 40;

        } else if (itemName == "Eggs") {
            System.out.println("Item selected: " + itemName);
            itemPrice = 70;

        } else if (itemName == "Rice") {
            System.out.println("Item selected: " + itemName);
            itemPrice = 120;

        } else if (itemName == "Oil") {
            System.out.println("Item selected: " + itemName);
            itemPrice = 150;

        } else if (itemName == "Sugar") {
            System.out.println("Item selected: " + itemName);
            itemPrice = 45;

        } else if (itemName == "Salt") {
            System.out.println("Item selected: " + itemName);
            itemPrice = 20;

        } else if (itemName == "Soap") {
            System.out.println("Item selected: " + itemName);
            itemPrice = 35;

        } else if (itemName == "Shampoo") {
            System.out.println("Item selected: " + itemName);
            itemPrice = 90;

        } else if (itemName == "Biscuits") {
            System.out.println("Item selected: " + itemName);
            itemPrice = 30;

        } else {
            System.out.println("Item not available");
        }

        return itemPrice;
    }

    // Method 2
    static short getDetail(String itemName, short itemPrice, short quantity) {
        short totalAmount = 0;

        if (itemName == "Milk") {
            totalAmount = (short)(itemPrice * quantity);

        } else if (itemName == "Bread") {
            totalAmount = (short)(itemPrice * quantity);

        } else if (itemName == "Eggs") {
            totalAmount = (short)(itemPrice * quantity);

        } else if (itemName == "Rice") {
            totalAmount = (short)(itemPrice * quantity);

        } else if (itemName == "Oil") {
            totalAmount = (short)(itemPrice * quantity);

        } else if (itemName == "Sugar") {
            totalAmount = (short)(itemPrice * quantity);

        } else if (itemName == "Salt") {
            totalAmount = (short)(itemPrice * quantity);

        } else if (itemName == "Soap") {
            totalAmount = (short)(itemPrice * quantity);

        } else if (itemName == "Shampoo") {
            totalAmount = (short)(itemPrice * quantity);

        } else if (itemName == "Biscuits") {
            totalAmount = (short)(itemPrice * quantity);

        } else {
            System.out.println("Invalid item");
        }

        return totalAmount;
    }

    public static void main(String[] args) {

        short price = Zepto.getDetail("Milk");
        System.out.println("Price of one item: " + price);

        short total = Zepto.getDetail("Milk", price, (short)5);
        System.out.println("Total amount: " + total);
    }
}