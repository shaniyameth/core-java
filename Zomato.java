class Zomato {

    String foodName;
    String restaurant;
    int price;

    
    Zomato(String restaurant) {
        this.restaurant = restaurant;
        System.out.println("1 parameter");
    }

    
    Zomato(String foodName, int price) {
        this.foodName = foodName;
        this.price = price;
        System.out.println("2 parameters");
    }

   
    Zomato(String foodName, String restaurant, int price) {
        this.foodName = foodName;
        this.restaurant = restaurant;
        this.price = price;
        System.out.println("3 parameters");
    }

    void display() {
        System.out.println(foodName);
        System.out.println(restaurant);
        System.out.println(price);
        System.out.println("------------");
    }
}

