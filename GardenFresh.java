class GardenFresh{
    public static void main(String[]args){

        String [] plants=new String[10];
        plants[0]="Rose";
        plants[2]="Tulip";
        plants[4]="Sunflower";
        plants[6]="Cactus";
        plants[8]="Fern";

        for(String sec:plants){
            System.out.println("plants section items ");
            System.out.println(sec);
        }

        for(int i=0;i<plants.length;i++){
            System.out.println("plants item index :"+i);
            System.out.println(plants[i]);
        }

        String [] tools=new String[10];
        tools[1]="Shovel";
        tools[3]="Rake";
        tools[5]="Pruners";
        tools[7]="Hose";
        tools[9]="Watering Can";

        for(String sec:tools){
            System.out.println("tools section items ");
            System.out.println(sec);
        }
        for(int j=0;j<tools.length;j++){
            System.out.println("tools item index :"+j);
            System.out.println(tools[j]);
        }

        // 1. Decor items
        String [] decor=new String[8];
        decor[0]="Pots";
        decor[2]="Fountains";
        decor[4]="Lights";
        decor[6]="Gnome";

        for(String sec:decor){
            System.out.println("garden decor section items ");
            System.out.println(sec);
        }
        for(int k=0;k<decor.length;k++){
            System.out.println("garden decor item index :"+k);
            System.out.println(decor[k]);
        }
    }
}