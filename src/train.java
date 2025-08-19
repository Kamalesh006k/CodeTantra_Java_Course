import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = {"lower", "middle", "upper", "side lower", "side upper"};
        int m =n;
        if(n>8){
            m = n%8;
        }else{
            m = n;
        }
        switch (m){
            case 0 :
                System.out.println("side upper");
                break;
            case 1 :
                System.out.println("lower");
                break;
            case 2 :
                System.out.println("middle");
                break;
            case 3 :
                System.out.println("upper");
                break;
            case 4:
                System.out.println("lower");
                break;
            case 5:
                System.out.println("middle");
                break;
            case 6:
                System.out.println("upper");
                break;
            case 7:
                System.out.println("side lower");
                break;
            case 8:
                System.out.println("side upper");
                break;
        }
    }
}
