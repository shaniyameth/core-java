class EmployeeRecord {

    public static void main(String[] args) {

        double salary;
        boolean isPermanent;
        String empName;
        char grade;
        int empId;

        salary = 45000.75;
        isPermanent = true;
        empName = "Raju";
        grade = 'A';
        empId = 101;

        System.out.println("Salary: " + salary);
        System.out.println("Permanent: " + isPermanent);
        System.out.println("Employee Name: " + empName);
        System.out.println("Grade: " + grade);
        System.out.println("Employee ID: " + empId);

        salary = 52000.50;
        isPermanent = false;
        empName = "Alex";
        grade = 'B';
        empId = 102;

        System.out.println("---- After Changing Values ----");

        System.out.println("Salary: " + salary);
        System.out.println("Permanent: " + isPermanent);
        System.out.println("Employee Name: " + empName);
        System.out.println("Grade: " + grade);
        System.out.println("Employee ID: " + empId);
    }
}