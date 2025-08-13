public class Compile_time_polymorphism {
    public void Attendance(String name){
        System.out.println("Attendance marked using name "+name);
    }
    public void Attendance(int rollno){
        System.out.println("Attendance marked using rollno. "+rollno);
    }
    public void Attendance(int rollno, String name){
        System.out.println("Attendance marking using rollno. and name "+rollno +" "+name);
    }
    public static void main(String[] args) {
        Compile_time_polymorphism c = new Compile_time_polymorphism();
        c.Attendance(21);
        c.Attendance("Kamalesh");
        c.Attendance(12,"Kamalesh");
    }
}
