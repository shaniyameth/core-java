class SwiggyRunner {
    public static void main(String[] args) {

        Swiggy s1 = new Swiggy("KFC");
        s1.display();

        Swiggy s2 = new Swiggy("Burger", 120);
        s2.display();

        Swiggy s3 = new Swiggy("Pizza", "Dominos", 250);
        s3.display();
    }
}