import java.util.Scanner;

public class q1 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an odd length word");
        String word=scanner.nextLine();

        int remainder=word.length()%2;
        if(remainder==1)
        {
            System.out.println(word.charAt(word.length()/2));
        }
        else
            System.out.println("Not an odd length word");
    }
}

