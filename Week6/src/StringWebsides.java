import java.util.Scanner;

public class StringWebsides {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the webside");
        String webside=inp.nextLine();

        if(webside.equals("googleChrom")){
            System.out.println("Procced with good goolge chorom");
        }else if(webside.equals("Safari")){
            System.out.println("Procced with safari ");
        }else if(webside.equals("firfox")){
            System.out.println("procced with fair fox");
        }


    }
}
