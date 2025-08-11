import java.util.Scanner;

public class Reversing_the_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a = sc.nextInt();
        int rev = 0;
        while(a!=0){
            int digit = a%10;
            a/=10;
            rev = rev*10 + digit;
        }
        System.out.println("Number after reversing: "+rev);
    }
}
