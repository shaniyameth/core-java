class ElectronicsRunner {
    public static void main(String[] args) {

        Electronics e1 = new Electronics("Samsung");
        e1.display();

        Electronics e2 = new Electronics("Laptop", 50000);
        e2.display();

        Electronics e3 = new Electronics("Mobile", "Apple", 80000);
        e3.display();
    }
}