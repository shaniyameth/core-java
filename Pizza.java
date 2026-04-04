class Pizza{
public Pizza(){
this("Domino's Pizza");
}
public Pizza(String name){
this(8, 350);
System.out.println("Pizza Brand: "+name);
}
public Pizza(int slices, int calories){
this(30, 12, 4.5f);
System.out.println("Nutrition Details: Slices: "+slices+" and Calories: "+calories);
}
public Pizza(int diameter, int toppingsCount, float rating){
this("10 Oct 2023", "Cheese", "Oregano", "Pepperoni-Special");
System.out.println("Size and Quality: Diameter cm: "+diameter+", Toppings: "+toppingsCount+", Rating: "+rating);
}
public Pizza(String expiry, String side1, String side2, String flavourName){
this("Brown", true, true, "Oven", true);
System.out.println("Ingredients and Add-ons: Expiry Date: "+expiry+", Side1 :"+side1+", Side2 :"+side2+", Flavour Name: "+flavourName);
}
public Pizza(String crustColor, boolean isSpicy, boolean isVeg, String bakingMode, boolean isHot){
System.out.println("Appearance of the Pizza: Crust Color: "+crustColor+", Is Spicy :"+isSpicy+", Is Veg :"+isVeg+", Baking Mode: "+bakingMode+ ", Is Hot: "+isHot);
}
}
