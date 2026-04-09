class AutoSpares{
    public static void main(String[]args){

        String [] parts=new String[12];
        parts[0]="Brake Pad";
        parts[2]="Oil Filter";
        parts[4]="Spark Plug";
        parts[6]="Battery";
        parts[8]="Headlight";
        parts[10]="Clutch";

        for(String sec:parts){
            System.out.println("spare parts section items ");
            System.out.println(sec);
        }

        for(int i=0;i<parts.length;i++){
            System.out.println("spare parts item index :"+i);
            System.out.println(parts[i]);
        }

        String [] accessories=new String[10];
        accessories[1]="Seat Cover";
        accessories[3]="Floor Mat";
        accessories[5]="Car Perfume";
        accessories[7]="Phone Mount";
        accessories[9]="Wipers";

        for(String sec:accessories){
            System.out.println("car accessories section items ");
            System.out.println(sec);
        }
        for(int j=0;j<accessories.length;j++){
            System.out.println("car accessories item index :"+j);
            System.out.println(accessories[j]);
        }

        // 1. Tires items
        String [] tires=new String[8];
        tires[0]="Alloy Wheel";
        tires[2]="Rubber Tire";
        tires[4]="Tube";
        tires[6]="Rim";

        for(String sec:tires){
            System.out.println("tires section items ");
            System.out.println(sec);
        }
        for(int k=0;k<tires.length;k++){
            System.out.println("tires item index :"+k);
            System.out.println(tires[k]);
        }
    }
}