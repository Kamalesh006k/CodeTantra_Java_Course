import java.util.Scanner;
public class Sales_Record_Per_Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        int sum =0;
        int avg =0;
        int j =1;
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the Income of Day " + j +" : ");
            j++;
            arr[i] = sc.nextInt();
        }
        System.out.print("Incomes From Day1 - Day: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.println("The Total Income Per Week: "+sum);
        avg = sum/7;
        System.out.println("The Average Income Per Week: "+avg);

    }
}
