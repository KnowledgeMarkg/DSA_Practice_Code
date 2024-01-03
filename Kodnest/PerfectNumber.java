import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Check It is Perfect Number or Not");
        int num = sc.nextInt();
        boolean b = checkPerfect(num);
        if(b){
            System.out.println("Given Number "+num +" is a Perfect Number");
        }else {
            System.out.println("Given Number "+num +" is not a Perfect Number");
        }
    }

    private static boolean checkPerfect(int num) {
        int temp = num;
        int sum =0;
        for (int i=1; i<temp; i++){
            if(temp %i ==0){
                sum+=i;
            }
        }
        if (num==sum){
            return true;
        }else {
            return false;
        }
    }
}
