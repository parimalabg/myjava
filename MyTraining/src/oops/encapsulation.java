package oops;
class Login{
	String username;
	private String password;
	public void loginValidation() {
		System.out.println("username ="+ username);
		System.out.println("password = " + password);
	}
	public void setPassword(String passwd) {
		this.password =passwd;
	}
}
public class encapsulation {
	public static void main(String[] args) {
		Login obj = new Login();
		obj.username = "dan@gmail.com";
	//	obj.password = "test1234";
		obj.setPassword("test1234");
		obj.loginValidation();
		
		
		//Hacker
		System.out.println("...From Hacker...");
		System.out.println("...password..");
		
	}
}
