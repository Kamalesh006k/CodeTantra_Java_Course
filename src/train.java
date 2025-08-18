import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        boolean lower = false;
//        boolean middle = false;
//        boolean upper = false;
//        boolean sl = false;
//        boolean su = false;
//
//        for(int i = 1; i<=72; i+=3){
//            if(n==i){
//                for (int j=7; j<=72; j+=6){
//                    if(n==j){
//                        break;
//                    }else {
//                        lower = true;
//                    }
//                }
//            }
//        }
//
//        for(int i = 1; i<=72; i+=3){
//            if(n==i){
//                for (int j=8; j<=72; j+=6){
//                    if(n==j){
//                        break;
//                    }else {
//                        upper = true;
//                    }
//                }
//            }
//        }
//
//        for(int i = 1; i<=72; i+=3){
//            if(n==i){
//                for (int j=7; j<=72; j+=6){
//                    if(n==j){
//                        break;
//                    }else {
//                        lower = true;
//                    }
//                }
//            }
//        }
//
//        for(int i = 7; i<=72; i+=6){
//            if(n==i){
//                sl = true;
//            }
//        }
//
//        for(int i = 8; i<=72; i+=6){
//            if(n==i){
//                su = true;
//            }
//        }
//
//        if(lower){
//            System.out.println("lower");
//        } else if (middle) {
//            System.out.println("middle");
//        }else if (upper) {
//            System.out.println("upper");
//        }else if (sl) {
//            System.out.println("side lower");
//        }else if (su) {
//            System.out.println("side upper");
//        }

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
