interface interf{
   public int squareit(int n );
}

interface interf2{
    public int squareRoot(int n );
}
public class LamdaExpression {
   public static void main(String[] args) {
     interf i = n->n*n;
     interf2 i2 = n-> (int)Math.sqrt(n);
    System.out.println("The Square Of 5 is " +i.squareit(5));
    System.out.println("The Square Root of 25 is "+i2.squareRoot(25));
   }
}
