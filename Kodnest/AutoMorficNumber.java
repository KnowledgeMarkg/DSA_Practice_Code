import java.util.Scanner;

public class AutoMorficNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Check Number Is AutoMorfic Or Not");
        int n = sc.nextInt();
        boolean b  =  checkAutoMorfic(n);
        if(b){
            System.out.println("Given Number "+n +" is a Auto Morfic Number");
        }else {
            System.out.println("Given Number "+n +" is not a Auto Morfic Number");
        }
    }

    private static boolean checkAutoMorfic(int n) {
        int sqr = n*n;
        while (n !=0){
            if(sqr% 10 != n%10){
                return false;
            }
            sqr = sqr/10;
            n = n/10;
        }
        return true;
    }
}
