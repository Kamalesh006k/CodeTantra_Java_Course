import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix_Traversal {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int rstart = 0;
        int cstart = 0;
        int rend = arr.length - 1;
        int cend = arr[0].length - 1;

        List<Integer> result = new ArrayList<>();

        while (rstart <= rend && cstart <= cend) {

            for (int i = cstart; i <= cend; i++) {
                result.add(arr[rstart][i]);
            }
            rstart++;

            for (int i = rstart; i <= rend; i++) {
                result.add(arr[i][cend]);
            }
            cend--;

            if (rstart <= rend) {
                for (int i = cend; i >= cstart; i--) {
                    result.add(arr[rend][i]);
                }
                rend--;
            }

            if (cstart <= cend) {
                for (int i = rend; i >= rstart; i--) {
                    result.add(arr[i][cstart]);
                }
                cstart++;
            }
        }

        System.out.println(result);
    }
}
