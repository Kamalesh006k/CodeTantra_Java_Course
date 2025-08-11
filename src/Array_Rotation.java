import java.util.Scanner;

public class Array_Rotation {

    public static void rotate_Array(int[] arr, int start, int end){
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
        System.out.print("Enter the Size of the array:");
        int s = sc.nextInt();
        System.out.print("Enter the Number of Rotation:");
        int a = sc.nextInt();
        int k= a%s;
        int[] arr = new int[s];
        System.out.println("Enter the values of the Array:");
        for (int i=0; i<s; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array Before Rotation: ");
        for(int i=0; i<s; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        rotate_Array(arr,0,k-1);
        rotate_Array(arr,k,s-1);
        rotate_Array(arr,0,s-1);

        System.out.print("Array After Rotation: ");
        for(int i=0; i<s; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
