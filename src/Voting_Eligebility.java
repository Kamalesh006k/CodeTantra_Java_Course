public class Voting_Eligebility {

    public static boolean checkage(int age) throws AgeException {
        if(age<18) {
            throw new AgeException("Not eligible to vote");
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        try {
            if(checkage(5)){
                System.out.println("Eligible to vote");
            }
        }
        catch (AgeException e){
            System.out.println("Enter valid age");
        }
    }
}
