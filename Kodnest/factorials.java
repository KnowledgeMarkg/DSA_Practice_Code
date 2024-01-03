import java.util.Scanner;

public class factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To find Its Factorials");
        int num = sc.nextInt();
        int fact = findFact(num);
        System.out.println(fact);
    }

    private static int findFact(int num) {
        int fact =1;
        for (int i=num ; i>0; i--){
            fact*=i;
        }
        return fact;
    }
}
