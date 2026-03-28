class CampusScholar {

    public static void main(String[] args) {

        
        double attendancePercentage;
        String studentName;
        char gradeSection;
        boolean feePaid;
        int rollNumber;

       
        attendancePercentage = 88.5;
        studentName = "John";
        gradeSection = 'A';
        feePaid = true;
        rollNumber = 101;

       
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Attendance Percentage: " + attendancePercentage);
        System.out.println("Grade Section: " + gradeSection);
        System.out.println("Fee Paid: " + feePaid);

       
        attendancePercentage = 76.2;
        studentName = "Maxx";
        gradeSection = 'B';
        feePaid = false;
        rollNumber = 205;

        System.out.println("---- Updated Student Record ----");

        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Attendance Percentage: " + attendancePercentage);
        System.out.println("Grade Section: " + gradeSection);
        System.out.println("Fee Paid: " + feePaid);
    }
}