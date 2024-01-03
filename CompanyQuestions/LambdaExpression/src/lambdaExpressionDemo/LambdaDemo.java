package lambdaExpressionDemo;
 @FunctionalInterface
 interface Cab {
	 public void bookcab();
 }

public class LambdaDemo {

	public static void main(String[] args) {
		Cab cabOla = ()->System.out.println("Ola is booked.....");;
		cabOla.bookcab();
	}

}
