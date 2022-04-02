package oops;

abstract class Car{
	abstract public void carName(); 
	abstract public void manufacturer();
	abstract public void mileage();
	
}

class Seltos extends Car{

	@Override
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
public class AbstractionExample {

	public static void main(String[] args) {
		Car obj = new Seltos();
		obj.carName();
		obj.manufacturer();
		obj.mileage();
	}
}
