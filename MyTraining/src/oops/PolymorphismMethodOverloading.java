package oops;

public class PolymorphismMethodOverloading {
	public void add() {
		
	}
	public void add (int a, int b) {
		
	}
	public void add(int a, int b, int c) {
		
	}
public void add(double a, double b) {
		
	}
	
	public static void main (String[] args) {
		PolymorphismMethodOverloading obj = new PolymorphismMethodOverloading();
		obj.add(1, 1);
		obj.add(5.5,3.3);
		obj.add(3,4,5);
		
	}
}

