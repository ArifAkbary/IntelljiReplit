import java.util.Scanner;

public class StringInLine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("In");
        String name1=scanner.next();

        for(int i=0; i<name1.length(); i++){
            System.out.println(name1.charAt(i));
        }




    }
}
