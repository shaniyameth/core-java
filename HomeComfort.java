class HomeComfort{
    public static void main(String[]args){

        String [] livingRoom=new String[10];
        livingRoom[0]="Sofa";
        livingRoom[2]="Coffee Table";
        livingRoom[4]="TV Stand";
        livingRoom[6]="Recliner";
        livingRoom[8]="Bookshelf";

        for(String sec:livingRoom){
            System.out.println("living room section items ");
            System.out.println(sec);
        }

        for(int i=0;i<livingRoom.length;i++){
            System.out.println("living room item index :"+i);
            System.out.println(livingRoom[i]);
        }

        String [] bedroom=new String[10];
        bedroom[1]="Bed";
        bedroom[3]="Wardrobe";
        bedroom[5]="Dressing Table";
        bedroom[7]="Nightstand";
        bedroom[9]="Mattress";

        for(String sec:bedroom){
            System.out.println("bedroom section items ");
            System.out.println(sec);
        }
        for(int j=0;j<bedroom.length;j++){
            System.out.println("bedroom item index :"+j);
            System.out.println(bedroom[j]);
        }

        // 1. Kitchen items
        String [] kitchen=new String[8];
        kitchen[0]="Dining Table";
        kitchen[2]="Chairs";
        kitchen[4]="Cabinets";
        kitchen[6]="Stool";

        for(String sec:kitchen){
            System.out.println("kitchen section items ");
            System.out.println(sec);
        }
        for(int k=0;k<kitchen.length;k++){
            System.out.println("kitchen item index :"+k);
            System.out.println(kitchen[k]);
        }
    }
}