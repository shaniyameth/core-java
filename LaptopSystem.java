class Laptop{
public Laptop(){
this("Dell XPS 15");
}
public Laptop(String name){
this(16, 512);
System.out.println("Laptop Brand: "+name);
}
public Laptop(int ram, int storage){
this(5200, 11, 2.5f);
System.out.println("Hardware Details: Ram: "+ram+" and Storage: "+storage);
}
public Laptop(int battery, int osVersion, float uiVersion){
this("15 March 2024", "Wifi", "Bluetooth", "Model-9520");
System.out.println("Battery and OS Details: Battery mAh: "+battery+", OS Version: "+osVersion+", UI Version: "+uiVersion);
}
public Laptop(String lastUpdate, String conn1, String conn2, String modelName){
this("Silver", true, true, "Type-C", true);
System.out.println("Updates and Connectivity: Last Updated: "+lastUpdate+", Connection 1: "+conn1+", Connection 2: "+conn2+", Model Name: "+modelName);
}
public Laptop(String color, boolean isFingerprint, boolean isWebcamPresent, String chargingPort, boolean isOriginal){
System.out.println("Appearance of the Laptop: Colour: "+color+", Is Fingerprint Support :"+isFingerprint+", Is Webcam Present :"+isWebcamPresent+", Charging Port: "+chargingPort+ ", Is Original: "+isOriginal);
}
}


