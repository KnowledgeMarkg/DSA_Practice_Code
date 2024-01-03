package lambdaExpressionDemo;
@FunctionalInterface

  interface MathOperation {
      int operate(int a, int b);
   } 

public class LambdaExample {

	public static void main(String[] args) {
	    MathOperation additionMathOperation = (a ,b) -> a+b;   
	    MathOperation subMathOperation = (a,b) -> a-b;
	    
	    int result1 = additionMathOperation.operate(6, 5);
	    int result2 = subMathOperation.operate(10, 5);
	    
	    System.out.println("Addition result: " +result1);
	    System.out.println("Subtraction result: " +result2);
	}

}
