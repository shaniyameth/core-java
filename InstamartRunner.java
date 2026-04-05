class InstamartRunner {
    public static void main(String[] args) {

        Instamart i1 = new Instamart("Groceries");
        i1.display();

        Instamart i2 = new Instamart("Milk", 50);
        i2.display();

        Instamart i3 = new Instamart("Rice", "Staples", 120);
        i3.display();
    }
}