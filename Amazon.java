class Amazon {

    int quantity;
    String productName;
    double price;
    boolean isAvailable;
    int productId;

    public Amazon(int a1, String a2, double a3, boolean a4, int a5) {
        quantity = a1;
        productName = a2;
        price = a3;
        isAvailable = a4;
        productId = a5;
    }

    public void show() {
        System.out.println(quantity);
        System.out.println(productName);
        System.out.println(price);
        System.out.println(isAvailable);
        System.out.println(productId);
    }
}