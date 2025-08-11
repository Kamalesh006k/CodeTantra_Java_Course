public class Mul_OF_2D_Arrays {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] arr3 = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int sum =0;
                for(int k=0; k<3; k++){
                    sum += arr1[i][j]*arr2[j][i];
                }
                arr3[i][j]=sum;
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("%d \t",arr3[i][j]);
            }System.out.println();
        }
    }
}
