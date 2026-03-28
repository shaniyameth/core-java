class StaffDetails {

    public static void main(String[] args) {

        boolean isPermanent;
        char grade;
        double salary;
        int empId;
        String empName;

        isPermanent = true;
        grade = 'A';
        salary = 45000.75;
        empId = 101;
        empName = "Raju";

        System.out.println("Permanent: " + isPermanent);
        System.out.println("Grade: " + grade);
        System.out.println("Salary: " + salary);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);

        isPermanent = false;
        grade = 'B';
        salary = 52000.50;
        empId = 102;
        empName = "Alex";

        System.out.println("---- After Changing Values ----");

        System.out.println("Permanent: " + isPermanent);
        System.out.println("Grade: " + grade);
        System.out.println("Salary: " + salary);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}