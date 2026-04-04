class Dog{
public Dog(){
this("Golden Retriever");
}
public Dog(String name){
this(4, 12);
System.out.println("Dog Breed: "+name);
}
public Dog(int age, int weight){
this(4500, 3, 5.0f);
System.out.println("Health Details: Age: "+age+" years and Weight: "+weight+" kg");
}
public Dog(int calorieIntake, int walksPerDay, float trainingLevel){
this("1 Feb 2024", "Bark", "Fetch", "Buddy-01");
System.out.println("Activity Details: Calories: "+calorieIntake+", Walks: "+walksPerDay+", Training: "+trainingLevel);
}
public Dog(String vetVisit, String trick1, String trick2, String petName){
this("Golden", true, true, "Leash", true);
System.out.println("Skills and Info: Vet Visit: "+vetVisit+", Trick1 :"+trick1+", Trick2 :"+trick2+", Pet Name: "+petName);
}
public Dog(String furColor, boolean isVaccinated, boolean isNeutered, String accessory, boolean isFriendly){
System.out.println("Appearance of the Dog: Fur Color: "+furColor+", Is Vaccinated :"+isVaccinated+", Is Neutered :"+isNeutered+", Accessory: "+accessory+ ", Is Friendly: "+isFriendly);
}
}


