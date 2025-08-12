import java.util.Scanner;

public class Armstrong_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int sum =0;
        int digit =0;
        int l = String.valueOf(n).length();
        int original = n;
        int result = 0;

        while(n>0){
            digit = n%10;
            result += Math.pow(digit,l);
            n/=10;
        }

        if(original==result){
            System.out.println("The Given number is a Armstrong Number...");
        }else{
            System.out.println("The Given number is not a Armstrong Number...");
        }
    }
}
