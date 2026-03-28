class WorkProfile {

    public static void main(String[] args) {

        int empId;
        String empName;
        boolean isPermanent;
        double salary;
        char grade;

        empId = 101;
        empName = "Raju";
        isPermanent = true;
        salary = 45000.75;
        grade = 'A';

        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Permanent: " + isPermanent);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);

        empId = 102;
        empName = "Alex";
        isPermanent = false;
        salary = 52000.50;
        grade = 'B';

        System.out.println("---- After Changing Values ----");

        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Permanent: " + isPermanent);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
    }
}