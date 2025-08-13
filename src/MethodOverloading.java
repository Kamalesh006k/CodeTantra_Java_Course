public class MethodOverloading {

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    double add(double a, double b, double c){
        return a+b+c;
    }

    public static void main(String[] args) {

        MethodOverloading m = new MethodOverloading();

        System.out.println(m.add(1,2));
        System.out.println(m.add(1,2,3));
        System.out.println(m.add(1.5,2.5));
        System.out.println(m.add(1.5,2.5,3.5));

    }
}
