class Student{
public Student(){
this("John Doe");
}
public Student(String name){
this(85, 12);
System.out.println("Student Name: "+name);
}
public Student(int grade, int age){
this(100, 10, 3.5f);
System.out.println("Academic Details: Grade: "+grade+" and Age: "+age);
}
public Student(int attendance, int standard, float gpa){
this("1 June 2024", "Math", "Science", "Roll-101");
System.out.println("Attendance and Standard: Attendance %: "+attendance+", Standard: "+standard+", GPA: "+gpa);
}
public Student(String lastUpdate, String sub1, String sub2, String rollNumber){
this("Blue", true, true, "Bus", false);
System.out.println("Subjects and Details: Last Updated: "+lastUpdate+", Sub1 :"+sub1+", Sub2 :"+sub2+", Roll Number: "+rollNumber);
}
public Student(String uniformColor, boolean isScholar, boolean isAthlete, String transport, boolean isLibraryMember){
System.out.println("Appearance of the Student: Uniform Color: "+uniformColor+", Is Scholar :"+isScholar+", Is Athlete :"+isAthlete+", Transport: "+transport+ ", Is Library Member: "+isLibraryMember);
}
}


