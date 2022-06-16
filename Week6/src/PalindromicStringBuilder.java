import java.util.Scanner;

public class PalindromicStringBuilder {
    public static void main(String[] args) {

        Scanner inpt=new Scanner(System.in);
        System.out.println("In");
        String IsItPalndromic= inpt.next();


        StringBuilder str=new StringBuilder();
        StringBuilder reverse=str.reverse();

      if(IsItPalndromic.equalsIgnoreCase(reverse.toString())){
          System.out.println(true);
      }else {
          System.out.println(false);
      }














    }
}
