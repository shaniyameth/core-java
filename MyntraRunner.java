class MyntraRunner {
    public static void main(String[] args) {

        Myntra m1 = new Myntra(true, 1999.0, 10, "Jeans", 1101);
        m1.show();

        Myntra m2 = new Myntra(true, 999.0, 15, "T-Shirt", 1102);
        m2.show();

        Myntra m3 = new Myntra(false, 2499.0, 5, "Jacket", 1103);
        m3.show();

        Myntra m4 = new Myntra(true, 799.0, 20, "Top", 1104);
        m4.show();

        Myntra m5 = new Myntra(false, 1499.0, 8, "Shoes", 1105);
        m5.show();

        Myntra m6 = new Myntra(true, 1299.0, 12, "Kurta", 1106);
        m6.show();

        Myntra m7 = new Myntra(true, 599.0, 18, "Cap", 1107);
        m7.show();
    }
}