package oops;

public class TryCatchExample {
		
		public void divide( int a , int b) {
			try{
				int result = a / b;
				System.out.println("result of division =" + result);
			}
			
			catch (ArithmeticException e) {
				System.out.println("divide by zero is not supported");
			
			}
			finally {
				System.out.println("finally done");
			}
		}
			
		public static void main(String[] args) {
			TryCatchExample obj = new TryCatchExample();
			obj.divide(10, 0);
			System.out.println("done");
			
		}
}
