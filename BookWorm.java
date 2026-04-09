class BookWorm{
    public static void main(String[]args){

        String [] fiction=new String[10];
        fiction[0]="Mystery";
        fiction[2]="Sci-Fi";
        fiction[4]="Fantasy";
        fiction[6]="Romance";
        fiction[8]="Thriller";

        for(String sec:fiction){
            System.out.println("fiction books section items ");
            System.out.println(sec);
        }

        for(int i=0;i<fiction.length;i++){
            System.out.println("fiction books item index :"+i);
            System.out.println(fiction[i]);
        }

        String [] stationery=new String[10];
        stationery[1]="Pen";
        stationery[3]="Pencil";
        stationery[5]="Notebook";
        stationery[7]="Eraser";
        stationery[9]="Scale";

        for(String sec:stationery){
            System.out.println("stationery section items ");
            System.out.println(sec);
        }
        for(int j=0;j<stationery.length;j++){
            System.out.println("stationery item index :"+j);
            System.out.println(stationery[j]);
        }

        // 1. Art Supplies items
        String [] art=new String[8];
        art[0]="Paints";
        art[2]="Brushes";
        art[4]="Canvas";
        art[6]="Sketchbook";

        for(String sec:art){
            System.out.println("art supplies section items ");
            System.out.println(sec);
        }
        for(int k=0;k<art.length;k++){
            System.out.println("art supplies item index :"+k);
            System.out.println(art[k]);
        }
    }
}