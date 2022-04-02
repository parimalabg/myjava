

package oops;

interface A{
	default public void test() {
		System.out.println("from test method");
	}
	abstract public void manufacturer();
	abstract public void mileage();
	
}

class B implements A{

	public void carName() {
		// TODO Auto-generated method stub
		System.out.println("Carname=Seltos");
		
	}

	@Override
	public void manufacturer() {
		System.out.println("Manufacturer =KIA");
			
	}

	@Override
	public void mileage() {
		// TODO Auto-generated method stub
		System.out.println("Mileage =15 Kmpl");
	}
	
}

class Hector extends Car{

	@Override
	public void carName() {
		// TODO Auto-generated method stub
		System.out.println("Carname=Hector");
		
	}

	@Override
	public void manufacturer() {
		System.out.println("Manufacturer =KIA");
			
	}

	@Override
	public void mileage() {
		// TODO Auto-generated method stub
		System.out.println("Mileage =15 Kmpl");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		Car obj = new Seltos();
		obj.carName();
		obj.manufacturer();
		obj.mileage();
	}
}
