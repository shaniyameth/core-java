class Odoo{
	String email;
	String password;
	
	public Odoo(String email, String password){
		this.email = email;
		this.password = password;
	}
	public void signIn(){
		System.out.println(email);
		System.out.println(password);
	}
}