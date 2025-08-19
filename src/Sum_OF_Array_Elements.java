import java.util.Scanner;

public class Sum_OF_Array_Elements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum =0;
        System.out.println("Enter the Values of the Array:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array Values: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.println("The sum of the Array Values: "+sum);

    }
}
