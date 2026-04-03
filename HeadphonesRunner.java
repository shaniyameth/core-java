class HeadphonesRunner {
    public static void main(String[] args) {

        Headphones h1 = new Headphones("Sony");
        h1.display();

        Headphones h2 = new Headphones("WH-1000XM4", 25000);
        h2.display();

        Headphones h3 = new Headphones("Bose", "QC45", 30000);
        h3.display();
    }
}