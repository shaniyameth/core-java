class Instamart {

    String itemName;
    String category;
    int price;


    Instamart(String category) {
        this.category = category;
        System.out.println("1 parameter");
    }

  
    Instamart(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
        System.out.println("2 parameters");
    }

    
    Instamart(String itemName, String category, int price) {
        this.itemName = itemName;
        this.category = category;
        this.price = price;
        System.out.println("3 parameters");
    }

    void display() {
        System.out.println(itemName);
        System.out.println(category);
        System.out.println(price);
        System.out.println("------------");
    }
}

