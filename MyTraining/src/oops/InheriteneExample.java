package oops;

class Grandfather{
	public void car() {
		System.out.println("Grandfather's car - maruthi 800");
	}
}
class Father extends Grandfather{
	public void bike() {
		System.out.println("Father's bike- Hero hondaSplendor");
	}
}
class Son extends Father{
}

class Daughter extends Father{
	
}
public class InheriteneExample {
public static void main(String[] args) {
	Son s1 = new Son();
	s1.bike();
	s1.car();
	Daughter d = new Daughter();
	d.bike();
}
}
