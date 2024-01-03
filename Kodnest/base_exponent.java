import java.util.Scanner;

public class base_exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Base ");
        int base = sc.nextInt();
        System.out.println("Enter The Exponent");
        int exp = sc.nextInt();

        int res = (int) Math.pow(base, exp);
        System.out.println(res);

        int rest = findRes(base, exp);
        System.out.println("Result My method is "+rest);
    }

    private static int findRes(int base, int exp) {
        int pow=1;
        for (int i =1 ; i<=exp; i++){
            pow*=base;
        }
        return pow ;
    }
}
