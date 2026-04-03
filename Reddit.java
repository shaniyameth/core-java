class Reddit{
	String email;
	String password;
	
	public Reddit(String email, String password){
		this.email = email;
		this.password = password;
	}
	public void signIn(){
		System.out.println(email);
		System.out.println(password);
	}
}