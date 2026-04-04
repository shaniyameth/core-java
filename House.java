class House{
public House(){
this("Villa on the Beach");
}
public House(String name){
this(4, 2500);
System.out.println("House Name: "+name);
}
public House(int rooms, int sqft){
this(2, 10, 4.9f);
System.out.println("Construction Details: Rooms: "+rooms+" and Area: "+sqft+" sqft");
}
public House(int floors, int bathrooms, float locationRating){
this("1 July 2024", "Pool", "Garden", "Sea-View-204");
System.out.println("Amenities and Location: Floors: "+floors+", Bathrooms: "+bathrooms+", Location Rating: "+locationRating);
}
public House(String purchaseDate, String amenity1, String amenity2, String houseId){
this("White", true, true, "Solar", true);
System.out.println("Property Details: Purchase Date: "+purchaseDate+", Amenity1 :"+amenity1+", Amenity2 :"+amenity2+", House ID: "+houseId);
}
public House(String wallColor, boolean isFurnished, boolean hasParking, String powerSource, boolean isSeaFacing){
System.out.println("Appearance of the House: Wall Color: "+wallColor+", Is Furnished :"+isFurnished+", Has Parking :"+hasParking+", Power Source: "+powerSource+ ", Is SeaFacing: "+isSeaFacing);
}
}


