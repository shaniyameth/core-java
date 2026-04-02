class Blinkit {

    String productItem;
    String deliveryLocation;
    int deliveryTime;

    public Blinkit() {
    }

    public Blinkit(String productItem, String deliveryLocation, int deliveryTime) {
        this.productItem = productItem;
        this.deliveryLocation = deliveryLocation;
        this.deliveryTime = deliveryTime;
    }

    public void display() {
        System.out.println(productItem);
        System.out.println(deliveryLocation);
        System.out.println(deliveryTime);
        System.out.println("-------------------");
    }
}

