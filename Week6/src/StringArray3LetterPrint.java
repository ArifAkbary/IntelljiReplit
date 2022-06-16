import javax.naming.PartialResultException;
import java.util.Scanner;

public class StringArray3LetterPrint {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word ");

        String [] name=new String[5];
        for(int i=0; i<5; i++){
            name[i]=scan.next();

            System.out.println(name[i].substring(0,3));

        }


        }


    }

