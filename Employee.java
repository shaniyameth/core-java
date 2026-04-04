class Employee{
public Employee(){
this("Google Inc.");
}
public Employee(String name){
this(100000, 50);
System.out.println("Company Name: "+name);
}
public Employee(int salary, int leaveBalance){
this(20, 10, 4.8f);
System.out.println("HR Details: Salary: "+salary+" and Leave Balance: "+leaveBalance);
}
public Employee(int experience, int teamSize, float appraisalRating){
this("1 Jan 2024", "Health", "Stock", "Eng-Manager");
System.out.println("Career Stats: Experience Yrs: "+experience+", Team Size: "+teamSize+", Rating: "+appraisalRating);
}
public Employee(String reviewDate, String benefit1, String benefit2, String designation){
this("White", true, true, "Laptop", true);
System.out.println("Perks and Role: Review Date: "+reviewDate+", Benefit1 :"+benefit1+", Benefit2 :"+benefit2+", Designation: "+designation);
}
public Employee(String idCardColor, boolean isRemote, boolean isFullTime, String deviceProvided, boolean isEligibleBonus){
System.out.println("Appearance of the Employee Profile: ID Color: "+idCardColor+", Is Remote :"+isRemote+", Is FullTime :"+isFullTime+", Device: "+deviceProvided+ ", Is Bonus Eligible: "+isEligibleBonus);
}
}


