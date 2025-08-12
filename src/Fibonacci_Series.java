import java.util.Scanner;

public class Fibonacci_Series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Enter a valid number");
        }else{
            int x =0, y=1, z;
            System.out.println("Fibonacci Series.....");
            System.out.print(x+" ");
            System.out.print(y+" ");
            for(int i=0; i<n-2; i++){
                z=x+y;
                System.out.print(z+" ");
                x=y;
                y=z;
            }
        }
    }
}
