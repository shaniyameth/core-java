class Digilocker{
	String fullName;
	long phNo;
	long aadaraNo;
	String email;
	String dob;
	
	public Digilocker(String fullName, long phNo, long aadaraNo, String email, String dob){
		this.fullName = fullName;
		this.phNo = phNo;
		this.aadaraNo = aadaraNo;
		this.email = email;
		this.dob = dob;
	}
	
	public void details(){
		System.out.println(fullName);
		System.out.println(phNo);
		System.out.println(aadaraNo);
		System.out.println(email);
		System.out.println(dob);
	}
}