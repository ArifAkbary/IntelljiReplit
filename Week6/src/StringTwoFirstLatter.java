import java.util.Scanner;

public class StringTwoFirstLatter {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word");
        String name=scan.nextLine();

       // skip one teke others
        for(int i=0; i<name.length(); i+=2){
            System.out.print(name.charAt(i));
        }


    }



}
