import java.util.Scanner;

public class Fibonacci_Recursion {

    public static int fib(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fib(n-2)+fib(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series...");
        for(int i=0; i<n; i++){
            int result = fib(i);
            System.out.print(result+" ");
        }
    }
}
