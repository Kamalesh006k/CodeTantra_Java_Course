import java.util.Scanner;

public class Factorial_Recursion {

    public static int fact(int n, int f){
        if(n==0){
            return f;
        }else{
            return fact(n-1, f*n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n: ");
        int n= sc.nextInt();
        if(n<=0){
            System.out.println("Enter a valid Number");
        }else{
            System.out.println("The Factorial of the number "+n+" is "+fact(n,1));
        }

    }
}
