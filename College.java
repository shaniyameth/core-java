class College{
public College(){
this("Stanford University");
}
public College(String name){
this(150, 500);
System.out.println("University Name: "+name);
}
public College(int courses, int buildings){
this(2024, 1, 5.0f);
System.out.println("Infrastructure Details: Courses: "+courses+" and Buildings: "+buildings);
}
public College(int establishedYear, int campusCount, float worldRank){
this("1 Sept 2024", "Research", "Sports", "CS-Dept");
System.out.println("History and Rank: Established: "+establishedYear+", Campus Count: "+campusCount+", World Rank: "+worldRank);
}
public College(String lastEvent, String facility1, String facility2, String deptName){
this("Cardinal", true, true, "Electric", true);
System.out.println("Campus Facilities: Last Event: "+lastEvent+", Facility1 :"+facility1+", Facility2 :"+facility2+", Dept Name: "+deptName);
}
public College(String mascotColor, boolean isPublic, boolean hasHostel, String busService, boolean isAccredited){
System.out.println("Appearance of the University: Mascot Color: "+mascotColor+", Is Public :"+isPublic+", Has Hostel :"+hasHostel+", Bus Service: "+busService+ ", Is Accredited: "+isAccredited);
}
}
