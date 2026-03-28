class OfficeEmployeeData {

    public static void main(String[] args) {

        boolean isPermanent;
        String empName;
        int empId;
        char grade;
        double salary;

        isPermanent = true;
        empName = "David";
        empId = 301;
        grade = 'A';
        salary = 68000.90;

        System.out.println("Permanent: " + isPermanent);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Grade: " + grade);
        System.out.println("Salary: " + salary);

        isPermanent = false;
        empName = "John";
        empId = 302;
        grade = 'B';
        salary = 72000.55;

        System.out.println("---- After Changing Values ----");

        System.out.println("Permanent: " + isPermanent);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Grade: " + grade);
        System.out.println("Salary: " + salary);
    }
}