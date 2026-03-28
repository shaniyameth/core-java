class BankAccount {
    // Declare 5 arrays, each with 10 values
    public int[] accountIds = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    public double[] balances = {1500.50, 2500.75, 800.00, 4200.30, 1100.20, 950.00, 3100.45, 600.75, 120.00, 5400.10};
    public String[] accountTypes = {"Savings", "Current", "Savings", "Current", "Savings", "Savings", "Current", "Savings", "Savings", "Current"};
    public String[] customerNames = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Harry", "Ivy", "Jack"};
    public boolean[] isActive = {true, true, false, true, true, false, true, false, true, true};

    // Method to display array data
    public void displayAccountData() {
        System.out.println("--- Bank Account Data ---");
        System.out.println("Account IDs: " + Arrays.toString(accountIds));
        System.out.println("Balances: " + Arrays.toString(balances));
        System.out.println("Account Types: " + Arrays.toString(accountTypes));
        System.out.println("Customer Names: " + Arrays.toString(customerNames));
        System.out.println("Active Statuses: " + Arrays.toString(isActive));
    }
}