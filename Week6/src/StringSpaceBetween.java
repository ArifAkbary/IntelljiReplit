import java.util.Scanner;

public class StringSpaceBetween {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter a word");
        String arif=inp.nextLine();


        System.out.println(arif.replaceAll(""," "));




    }
}
