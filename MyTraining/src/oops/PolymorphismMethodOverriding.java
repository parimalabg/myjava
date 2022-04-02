package oops;
class Mother{
	public void bike() {
		System.out.println("Mom's bike -Hero hnda  Activa");
	}
}
class Daughter extends Mother{
	public void bike() {
		System.out.println("Daughter's bike - Yamaha Fascino");
	}
}
public class PolymorphismMethodOverriding {
public static void main (String[] args) {
	Daughter obj = new Daughter(); // In this scenario Daughter's bike Yamaha is picked up. Always Local method or variable gets priority. Here the method in mother'sclass is overridden)
	obj.bike();
}
}
