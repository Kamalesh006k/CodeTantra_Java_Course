import java.util.Scanner;

public class Max_Val_OF_Array {

    public static int max_val(int[] arr){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            if(temp<arr[i]){
                temp = arr[i];
            }
        }return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array:");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the values of the Array:");
        for (int i=0; i<s; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array Values: ");
        for(int i=0; i<s; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int result = max_val(arr);
        System.out.println("The Maximum Element in the Array is : "+result);
    }
}
