class BankHDFC{
public Bank(){
this("HDFC Bank");
}
public Bank(String name){
this(5000, 12345);
System.out.println("Bank Name: "+name);
}
public Bank(int balance, int accountNum){
this(365, 2, 9.5f);
System.out.println("Account Details: Balance: "+balance+" and Account Num: "+accountNum);
}
public Bank(int validity, int cardType, float interestRate){
this("1 Jan 2025", "Credit", "Debit", "Visa-Gold");
System.out.println("Card and Interest: Validity Days: "+validity+", Card Type: "+cardType+", Interest Rate: "+interestRate);
}
public Bank(String lastUpdate, String card1, String card2, String schemeName){
this("Gold", true, true, "Online", true);
System.out.println("Banking Services: Last Updated: "+lastUpdate+", Card1 :"+card1+", Card2 :"+card2+", Scheme Name: "+schemeName);
}
public Bank(String cardColor, boolean isNetBanking, boolean isMobileBanking, String transactionMode, boolean isActive){
System.out.println("Appearance of the Card: Colour: "+cardColor+", Is NetBanking Support :"+isNetBanking+", Is MobileBanking :"+isMobileBanking+", Transaction Mode: "+transactionMode+ ", Is Active: "+isActive);
}
}


