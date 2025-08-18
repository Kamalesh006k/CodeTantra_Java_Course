import java.util.Scanner;

public class Division_by_Zero_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Divisor: ");
        int a = sc.nextInt();
        System.out.print("Enter the Divident: ");
        int b = sc.nextInt();
        try{
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Division by Zero is not allowed - "+ e);
        }
    }
}
