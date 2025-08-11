import java.util.Scanner;
public class Two_Dimensional_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr1 = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("Enter the value of arr1[%d][%d] :",i,j);
                arr1[i][j]=sc.nextInt();
                System.out.println();
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("Value of arr1[%d][%d] : %d \t",i,j,arr1[i][j]);
            }System.out.println();
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("%d \t",arr1[i][j]);
            }System.out.println();
        }
    }
}