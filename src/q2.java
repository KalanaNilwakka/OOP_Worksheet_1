import java.util.Scanner;

public class q2 {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstname=scanner.next();

        System.out.println("Enter your middle name");
        String middlename=scanner.next();

        System.out.println("Enter your last name");
        String lastname=scanner.next();

        System.out.println(lastname+", "+firstname+" "+middlename.charAt(0)+"." );
    }
}
