class SuperMart{
    public static void main(String[]args){

        String [] fruits=new String[10];
        fruits[0]="Apple";
        fruits[2]="Banana";
        fruits[4]="Mango";
        fruits[6]="Grapes";
        fruits[8]="Orange";

        for(String sec:fruits){
            System.out.println("fruits section items ");
            System.out.println(sec);
        }

        for(int i=0;i<fruits.length;i++){
            System.out.println("fruits item index :"+i);
            System.out.println(fruits[i]);
        }

        String [] vegetables=new String[8];
        vegetables[1]="Carrot";
        vegetables[3]="Potato";
        vegetables[5]="Tomato";
        vegetables[7]="Onion";

        for(String sec:vegetables){
            System.out.println("vegetables section items ");
            System.out.println(sec);
        }
        for(int j=0;j<vegetables.length;j++){
            System.out.println("vegetables item index :"+j);
            System.out.println(vegetables[j]);
        }

        // 1. Dairy items
        String [] dairy=new String[6];
        dairy[0]="Milk";
        dairy[2]="Cheese";
        dairy[4]="Yogurt";

        for(String sec:dairy){
            System.out.println("dairy section items ");
            System.out.println(sec);
        }
        for(int k=0;k<dairy.length;k++){
            System.out.println("dairy item index :"+k);
            System.out.println(dairy[k]);
        }
    }
}