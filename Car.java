class Car{
public Car(){
this("Tesla Model S");
}
public Car(String name){
this(1020, 2);
System.out.println("Car Brand: "+name);
}
public Car(int horsepower, int doors){
this(100, 12, 4.2f);
System.out.println("Performance Details: Horsepower: "+horsepower+" and Doors: "+doors);
}
public Car(int batteryRange, int softwareVer, float autonomyLevel){
this("20 May 2024", "5G", "GPS", "Plaid");
System.out.println("Range and Software: Battery Range: "+batteryRange+", Software Ver: "+softwareVer+", Autonomy Level: "+autonomyLevel);
}
public Car(String lastUpdate, String service1, String service2, String modelName){
this("Red", true, false, "Supercharger", true);
System.out.println("Software Updates and Services: Last Updated: "+lastUpdate+", Service 1: "+service1+", Service 2: "+service2+", Model Name: "+modelName);
}
public Car(String color, boolean isAutoPilot, boolean isSunroof, String chargingType, boolean isInsured){
System.out.println("Appearance of the Car: Colour: "+color+", Is AutoPilot Enabled :"+isAutoPilot+", Is Sunroof Present :"+isSunroof+", Charging Type: "+chargingType+ ", Is Insured: "+isInsured);
}
}


