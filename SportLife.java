class SportLife{
    public static void main(String[]args){

        String [] outdoor=new String[12];
        outdoor[0]="Cricket Bat";
        outdoor[2]="Football";
        outdoor[4]="Basketball";
        outdoor[6]="Tennis Racket";
        outdoor[8]="Badminton";
        outdoor[10]="Cycling Helmet";

        for(String sec:outdoor){
            System.out.println("outdoor sports section items ");
            System.out.println(sec);
        }

        for(int i=0;i<outdoor.length;i++){
            System.out.println("outdoor sports item index :"+i);
            System.out.println(outdoor[i]);
        }

        String [] gym=new String[10];
        gym[1]="Dumbbells";
        gym[3]="Treadmill";
        gym[5]="Yoga Mat";
        gym[7]="Resistance Bands";
        gym[9]="Kettlebell";

        for(String sec:gym){
            System.out.println("gym section items ");
            System.out.println(sec);
        }
        for(int j=0;j<gym.length;j++){
            System.out.println("gym item index :"+j);
            System.out.println(gym[j]);
        }

        // 1. Fitness items
        String [] fitness=new String[8];
        fitness[0]="Protein Powder";
        fitness[2]="Water Bottle";
        fitness[4]="Gloves";
        fitness[6]="Skipping Rope";

        for(String sec:fitness){
            System.out.println("fitness section items ");
            System.out.println(sec);
        }
        for(int k=0;k<fitness.length;k++){
            System.out.println("fitness item index :"+k);
            System.out.println(fitness[k]);
        }
    }
}