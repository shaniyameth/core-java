class Myntra {

    boolean isAvailable;
    double price;
    int quantity;
    String productName;
    int productId;

    public Myntra(boolean m1, double m2, int m3, String m4, int m5) {
        isAvailable = m1;
        price = m2;
        quantity = m3;
        productName = m4;
        productId = m5;
    }

    public void show() {
        System.out.println(isAvailable);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(productName);
        System.out.println(productId);
    }
}