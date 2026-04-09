class ToyBox{
    public static void main(String[]args){

        String [] toys=new String[12];
        toys[0]="Car";
        toys[2]="Doll";
        toys[4]="Lego";
        toys[6]="Puzzle";
        toys[8]="Robot";
        toys[10]="Drone";

        for(String sec:toys){
            System.out.println("toys section items ");
            System.out.println(sec);
        }

        for(int i=0;i<toys.length;i++){
            System.out.println("toys item index :"+i);
            System.out.println(toys[i]);
        }

        String [] games=new String[10];
        games[1]="Monopoly";
        games[3]="Chess";
        games[5]="Ludo";
        games[7]="Scrabble";
        games[9]="Uno";

        for(String sec:games){
            System.out.println("games section items ");
            System.out.println(sec);
        }
        for(int j=0;j<games.length;j++){
            System.out.println("games item index :"+j);
            System.out.println(games[j]);
        }

        // 1. Baby items
        String [] baby=new String[8];
        baby[0]="Diapers";
        baby[2]="Baby Wipes";
        baby[4]="Rattle";
        baby[6]="Blanket";

        for(String sec:baby){
            System.out.println("baby care section items ");
            System.out.println(sec);
        }
        for(int k=0;k<baby.length;k++){
            System.out.println("baby care item index :"+k);
            System.out.println(baby[k]);
        }
    }
}