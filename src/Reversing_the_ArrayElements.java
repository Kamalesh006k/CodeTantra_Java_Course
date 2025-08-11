import java.util.Scanner;

public class Reversing_the_ArrayElements {

    public static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array: ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the Values of the Array:");
        for(int i=0; i<s; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array Values: ");
        for(int i=0; i<s; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        reverse(arr);

        System.out.print("The values of Array after Reversing:");
        for(int i=0; i<s; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
