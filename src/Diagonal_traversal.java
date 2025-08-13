public class Diagonal_traversal {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rs = 0, cs = 0;
        int re = arr.length - 1;
        int ce = arr[0].length - 1;
        int direction = 1;
        int[] arr1 = new int[(re + 1) * (ce + 1)];
        int i = 0;

        while (cs <= ce && rs <= re) {
            if (direction == 1) {
                while (rs > 0 && cs < ce) {
                    arr1[i++] = arr[rs][cs];
                    rs--;
                    cs++;
                }
                arr1[i++] = arr[rs][cs];
                if (cs == ce) {
                    rs++;
                } else {
                    cs++;
                }
                direction = 0;
            } else {
                while (rs < re && cs > 0) {
                    arr1[i++] = arr[rs][cs];
                    rs++;
                    cs--;
                }
                arr1[i++] = arr[rs][cs];
                if (rs == re) {
                    cs++;
                } else {
                    rs++;
                }
                direction = 1;
            }
        }

        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + " ");
        }
    }
}
