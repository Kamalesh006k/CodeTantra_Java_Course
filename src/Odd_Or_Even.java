import java.util.Scanner;

public class Odd_Or_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if(n%2 ==0){
            System.out.println("The Given Number is Even");
        }else if(n==0){
            System.out.println("The Given Number is Zero");
        }else{
            System.out.println("The Given Number is Odd");
        }
    }
}
