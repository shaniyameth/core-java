class CompanyStaffProfile {

    public static void main(String[] args) {

        char grade;
        int empId;
        String empName;
        double salary;
        boolean isPermanent;

        grade = 'A';
        empId = 201;
        empName = "John";
        salary = 60000.80;
        isPermanent = true;

        System.out.println("Grade: " + grade);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Permanent: " + isPermanent);

        grade = 'B';
        empId = 202;
        empName = "David";
        salary = 75000.45;
        isPermanent = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Grade: " + grade);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Permanent: " + isPermanent);
    }
}