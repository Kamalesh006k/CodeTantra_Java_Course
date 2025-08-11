public class String_And_StringMethods {
    public static void main(String[] args) {

//        strings are immutable


        String name = new String("Kamalesh");
        String name1= "Kamalesh";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(6));
        System.out.println(name.equals("Kamalesh"));
        System.out.println(name.equalsIgnoreCase("KAMALESH"));
        System.out.println(name.substring(0,3));
        System.out.println(name.split(" "));
        System.out.println(name.trim());
        System.out.println(name.concat("rajan S"));
        System.out.println(name.indexOf('s'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.toCharArray());

//        StringBuilder and StringBuffer - both are mutable
//        StringBuilder is Asyn while the StringBuffer is syn with time and StringBuffers are thread safety


        StringBuilder name2= new StringBuilder("Kamalesh");
        System.out.println(name2.reverse());
        System.out.println(name2.append("rajan S"));

//        StringBuffer

        StringBuffer name3 = new StringBuffer("Kamalesh");
        System.out.println(name3.reverse());
        System.out.println(name3.append("rajan S"));
        System.out.println(name3.isEmpty());
    }
}
