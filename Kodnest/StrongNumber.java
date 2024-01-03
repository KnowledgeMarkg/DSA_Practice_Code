import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Check ");
        int num = sc.nextInt();
        boolean res = findDigit(num);
        if (res){
            System.out.println("The Given Is A Strong Number");
        }else {
            System.out.println("The Given Number Is not A Strong Number");
        }
    }
    private static int findFactSum(int num) {
        int fact =1;
        for (int i=num ; i>0; i--){
            fact*=i;

        }
        return fact;
    }

    private static boolean findDigit(int num) {
        int temp = num;
        int sum =0;
        while (temp!=0){
          int  digit = temp %10;
          int res = findFactSum(digit);
            sum+=res;
            temp = temp/10;
        }
        if (num==sum){
            return true;
        }else {
            return false;
        }
    }
}
