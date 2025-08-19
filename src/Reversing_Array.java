public class Reversing_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("Elements of an Array before reversing: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int start =0;
        int end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.print("Elements of an Array after reversing: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
