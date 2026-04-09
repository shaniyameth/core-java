class FashionHub{
    public static void main(String[]args){

        String [] mensWear=new String[10];
        mensWear[0]="Shirt";
        mensWear[2]="Jeans";
        mensWear[4]="T-Shirt";
        mensWear[6]="Jacket";
        mensWear[8]="Suit";

        for(String sec:mensWear){
            System.out.println("mens wear section items ");
            System.out.println(sec);
        }

        for(int i=0;i<mensWear.length;i++){
            System.out.println("mens wear item index :"+i);
            System.out.println(mensWear[i]);
        }

        String [] womensWear=new String[10];
        womensWear[1]="Dress";
        womensWear[3]="Skirt";
        womensWear[5]="Blouse";
        womensWear[7]="Saree";
        womensWear[9]="Leggings";

        for(String sec:womensWear){
            System.out.println("womens wear section items ");
            System.out.println(sec);
        }
        for(int j=0;j<womensWear.length;j++){
            System.out.println("womens wear item index :"+j);
            System.out.println(womensWear[j]);
        }

        // 1. Footwear items
        String [] footwear=new String[8];
        footwear[0]="Sneakers";
        footwear[2]="Boots";
        footwear[4]="Sandals";
        footwear[6]="Loafers";

        for(String sec:footwear){
            System.out.println("footwear section items ");
            System.out.println(sec);
        }
        for(int k=0;k<footwear.length;k++){
            System.out.println("footwear item index :"+k);
            System.out.println(footwear[k]);
        }
    }
}