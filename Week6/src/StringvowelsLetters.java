import java.util.Scanner;

public class StringvowelsLetters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter  a word");
        String vowels=scan.next();

        System.out.println(vowels.replaceAll("[^a,o,,e,i,u]",""));



    }
}
