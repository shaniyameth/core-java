class JCB{

static void addName(){
System.out.println("HELLO JCB FROM MANDYA");
System.out.println("IT IS A NO ONE JCB IN MANDYA");
}

static double getJcbCharge(){
System.out.println("THE CHARGES OF THE JCB PER HOUR");
double charge=2000.25;
System.out.println(charge);
return charge;
}

static void addloan(int loan1,int loan2,String type){
System.out.println("THE PRESENT JCB LOANS DIVIDE BY TWO PARTNERS:");
long totalloan=loan1+loan2;
System.out.println(totalloan);
System.out.println(" the loan is paid in :");
System.out.println(type);
}


static long addTotalIncome(long partner1,long partner2){
	 System.out.println("total income of the partner");
	 long partner=partner1+partner2;
	 System.out.println("total  is:"+partner);
	 return partner;
	 }
	 }