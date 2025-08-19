import java.util.Scanner;
public class Student_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int[] sum = new int[4];
        for(int i=1; i<=3; i++){
            System.out.println("Student "+i);
            for(int j=1; j<=3; j++){
                System.out.print(" Subject "+j+" mark: ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                sum[i]+=arr[i][j];
            }
        }
        System.out.println();
        for(int i=1;i<sum.length;i++){
            System.out.print("The Total Mark Obtained By Student "+i+" is ");
            System.out.println(sum[i]);
        }
        System.out.println();
        for(int i=1;i<sum.length;i++){
            System.out.print("The Average Mark Obtained By Student "+i+" is ");
            System.out.println((float) sum[i]/3);
        }
    }
}
