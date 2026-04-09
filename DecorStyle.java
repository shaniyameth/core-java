class DecorStyle{
    public static void main(String[]args){

        String [] wallArt=new String[10];
        wallArt[0]="Painting";
        wallArt[2]="Clock";
        wallArt[4]="Poster";
        wallArt[6]="Mirror";
        wallArt[8]="Wall Sticker";

        for(String sec:wallArt){
            System.out.println("wall art section items ");
            System.out.println(sec);
        }

        for(int i=0;i<wallArt.length;i++){
            System.out.println("wall art item index :"+i);
            System.out.println(wallArt[i]);
        }

        String [] lighting=new String[10];
        lighting[1]="Chandelier";
        lighting[3]="Lamp";
        lighting[5]="LED Strip";
        lighting[7]="Bulb";
        lighting[9]="Sconce";

        for(String sec:lighting){
            System.out.println("lighting section items ");
            System.out.println(sec);
        }
        for(int j=0;j<lighting.length;j++){
            System.out.println("lighting item index :"+j);
            System.out.println(lighting[j]);
        }

        // 1. Rugs items
        String [] rugs=new String[8];
        rugs[0]="Carpet";
        rugs[2]="Doormat";
        rugs[4]="Runner";
        rugs[6]="Shag Rug";

        for(String sec:rugs){
            System.out.println("rugs section items ");
            System.out.println(sec);
        }
        for(int k=0;k<rugs.length;k++){
            System.out.println("rugs item index :"+k);
            System.out.println(rugs[k]);
        }
    }
}