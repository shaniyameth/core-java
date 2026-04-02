class GitHub{
	String email;
	long phNo;
	String username;
	String password;
	
	public GitHub(String email, long phNo, String username, String password){
		this.email = email;
		this.phNo = phNo;
		this.username = username;
		this.password = password;
	}
	public void login(){
		System.out.println(email);
		System.out.println(phNo);
		System.out.println(username);
		System.out.println(password);
	}
}