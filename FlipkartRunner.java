class FlipkartRunner {
    public static void main(String[] args) {

        Flipkart f1 = new Flipkart("TV", 801, true, 8, 30000.0);
        f1.show();

        Flipkart f2 = new Flipkart("Shoes", 802, true, 25, 2500.0);
        f2.show();

        Flipkart f3 = new Flipkart("Backpack", 803, false, 12, 1200.0);
        f3.show();

        Flipkart f4 = new Flipkart("Mixer", 804, true, 10, 3500.0);
        f4.show();

        Flipkart f5 = new Flipkart("Fan", 805, true, 14, 2000.0);
        f5.show();

        Flipkart f6 = new Flipkart("AC", 806, false, 6, 40000.0);
        f6.show();

        Flipkart f7 = new Flipkart("Refrigerator", 807, true, 7, 30000.0);
        f7.show();
    }
}