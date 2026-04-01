class Meesho {

    int quantity;
    double price;
    String productName;
    boolean isAvailable;
    int productId;

    public Meesho(int m1, double m2, String m3, boolean m4, int m5) {
        quantity = m1;
        price = m2;
        productName = m3;
        isAvailable = m4;
        productId = m5;
    }

    public void show() {
        System.out.println(quantity);
        System.out.println(price);
        System.out.println(productName);
        System.out.println(isAvailable);
        System.out.println(productId);
    }
}