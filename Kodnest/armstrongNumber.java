import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To CHeck,  The Number Is Armstrong or Not");
        int num = sc.nextInt();
        int count = getCount(num);
        int res = getSumPow(num, count);
        System.out.println(res);
        if(res==num){
            System.out.println("The Given Number Is Armstrong");
        }else {
            System.out.println("the Given Number Is Not Armstrong");
        }
    }

    private static int getSumPow(int num, int count) {
        int sum =0;
        while (num !=0){
            int rem = num%10;
            sum = sum+ (int) Math.pow(rem, count);
            num = num/10;
        }
        return sum;
    }

    private static int getCount(int num) {
        int count=0;
        while (num !=0){
            num = num/10;
            count++;
        }
        return  count;
    }
}
