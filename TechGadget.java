class TechGadget{
    public static void main(String[]args){

        String [] mobiles=new String[12];
        mobiles[0]="Smartphone";
        mobiles[2]="Android";
        mobiles[4]="iPhone";
        mobiles[6]="Tablet";
        mobiles[8]="Foldable";
        mobiles[10]="Basic Phone";

        for(String sec:mobiles){
            System.out.println("mobiles section items ");
            System.out.println(sec);
        }

        for(int i=0;i<mobiles.length;i++){
            System.out.println("mobiles item index :"+i);
            System.out.println(mobiles[i]);
        }

        String [] laptops=new String[8];
        laptops[1]="Ultrabook";
        laptops[3]="Gaming Laptop";
        laptops[5]="2-in-1";
        laptops[7]="Workstation";

        for(String sec:laptops){
            System.out.println("laptops section items ");
            System.out.println(sec);
        }
        for(int j=0;j<laptops.length;j++){
            System.out.println("laptops item index :"+j);
            System.out.println(laptops[j]);
        }

        // 1. Accessories items
        String [] accessories=new String[10];
        accessories[0]="Headphones";
        accessories[2]="Charger";
        accessories[4]="Power Bank";
        accessories[6]="Mouse";
        accessories[8]="Keyboard";

        for(String sec:accessories){
            System.out.println("accessories section items ");
            System.out.println(sec);
        }
        for(int k=0;k<accessories.length;k++){
            System.out.println("accessories item index :"+k);
            System.out.println(accessories[k]);
        }
    }
}