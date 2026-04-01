class Flipkart {

    String productName;
    int productId;
    boolean isAvailable;
    int quantity;
    double price;

    public Flipkart(String f1, int f2, boolean f3, int f4, double f5) {
        productName = f1;
        productId = f2;
        isAvailable = f3;
        quantity = f4;
        price = f5;
    }

    public void show() {
        System.out.println(productName);
        System.out.println(productId);
        System.out.println(isAvailable);
        System.out.println(quantity);
        System.out.println(price);
    }
}