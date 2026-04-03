class Electronics {

    String name;
    String brand;
    int price;

  
    Electronics(String brand) {
        this.brand = brand;
        System.out.println("1 parameter");
    }


    Electronics(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("2 parameters");
    }

    Electronics(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        System.out.println("3 parameters");
    }

    void display() {
        System.out.println(name);
        System.out.println(brand);
        System.out.println(price);
        System.out.println("------------");
    }
}

