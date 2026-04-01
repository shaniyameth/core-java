class AmazonRunner {
    public static void main(String[] args) {

        Amazon a1 = new Amazon(5, "Speaker", 3000.0, true, 901);
        a1.show();

        Amazon a2 = new Amazon(12, "Charger", 800.0, true, 902);
        a2.show();

        Amazon a3 = new Amazon(7, "PowerBank", 1500.0, false, 903);
        a3.show();

        Amazon a4 = new Amazon(20, "Cable", 300.0, true, 904);
        a4.show();

        Amazon a5 = new Amazon(9, "SmartWatch", 5000.0, true, 905);
        a5.show();

        Amazon a6 = new Amazon(3, "Printer", 12000.0, false, 906);
        a6.show();

        Amazon a7 = new Amazon(6, "Router", 2500.0, true, 907);
        a7.show();
    }
}