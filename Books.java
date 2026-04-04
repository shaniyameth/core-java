class Books{
public Book(){
this("The Alchemist");
}
public Book(String name){
this(200, 15);
System.out.println("Book Title: "+name);
}
public Book(int pages, int chapters){
this(1988, 1, 4.7f);
System.out.println("Content Details: Pages: "+pages+" and Chapters: "+chapters);
}
public Book(int publishYear, int edition, float goodReadsRating){
this("1 Aug 2023", "Fiction", "Drama", "Harper-Collins");
System.out.println("Publishing Info: Year: "+publishYear+", Edition: "+edition+", Rating: "+goodReadsRating);
}
public Book(String purchaseDate, String genre1, String genre2, String publisherName){
this("Yellow", true, false, "Paperback", true);
System.out.println("Library Details: Purchase Date: "+purchaseDate+", Genre1 :"+genre1+", Genre2 :"+genre2+", Publisher: "+publisherName);
}
public Book(String coverColor, boolean isHardcover, boolean isAutographed, String bindingType, boolean isBestSeller){
System.out.println("Appearance of the Book: Cover Color: "+coverColor+", Is Hardcover :"+isHardcover+", Is Autographed :"+isAutographed+", Binding: "+bindingType+ ", Is BestSeller: "+isBestSeller);
}
}


