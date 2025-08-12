public class Classifications_Of_Methods {

    public static void student(){
        System.out.println("Hi, Im Kamalesh");
    }

    public static void student(String name){
        System.out.println("Hi, Im "+name);
    }

    public static String student2(){
        return "Hi, Im Kamalesh";
    }

    public static String student1(String name){
        return "Hi, Im "+name ;
    }
    public static void main(String[] args) {
//        1. without parameters and without return type
//        2. with parameters and without return tyrpe
//        3.without parameters and with return type
//        4.with parameters and with return type

        student();
        student("Kamalesh");
        System.out.println(student2());
        System.out.println(student1("Kamalesh"));


    }
}
