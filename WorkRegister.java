class WorkRegister {

    public static void main(String[] args) {

        int empId;
        boolean isPermanent;
        double salary;
        String empName;
        char grade;

        empId = 501;
        isPermanent = true;
        salary = 70000.25;
        empName = "Viki";
        grade = 'A';

        System.out.println("Employee ID: " + empId);
        System.out.println("Permanent: " + isPermanent);
        System.out.println("Salary: " + salary);
        System.out.println("Employee Name: " + empName);
        System.out.println("Grade: " + grade);

        empId = 502;
        isPermanent = false;
        salary = 82000.75;
        empName = "Max";
        grade = 'B';

        System.out.println("---- After Changing Values ----");

        System.out.println("Employee ID: " + empId);
        System.out.println("Permanent: " + isPermanent);
        System.out.println("Salary: " + salary);
        System.out.println("Employee Name: " + empName);
        System.out.println("Grade: " + grade);
    }
}