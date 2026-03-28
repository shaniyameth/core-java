public class BankData {
    public static void main(String[] args) {
        BankAccount myBank = new BankAccount();

        System.out.println("Accessing data from BankAccount class:");
        System.out.println("First Account ID: " + myBank.accountIds[0]);
        System.out.println("Fifth Customer Name: " + myBank.customerNames[4]);
        System.out.println("Length of balances array: " + myBank.balances.length);

        myBank.displayAccountData();
    }
}