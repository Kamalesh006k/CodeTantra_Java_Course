import java.util.Scanner;

public class Recursions_in_Java {

//    Classifications of recursion - tailed and non-tailed recursions

//    Tailed Recursion
    public  static int Sum (int n){
        if(n==0){
            return 0;
        }else{
            return n+Sum(n-1);
        }
    }

    public  static int sum(int n, int s){
        if(n==0){
            return s;
        }else{
            return sum(n-1,n+s);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the Value of n: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("The Sum of n Integers: ");
        System.out.println(Sum(a));

    }
}
