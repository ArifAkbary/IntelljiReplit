import java.util.Scanner;

public class Language {
    public static void main(String[] args) {
        Scanner inpt= new Scanner(System.in);

        System.out.println("Enter the name of computer language ?");
        String computerLanguge=inpt.nextLine();

        System.out.println(computerLanguge.replaceAll("Java","Java is a programming language"));
        System.out.println(computerLanguge.replaceAll("C","C is a prucidula progrmming language "));
        System.out.println(computerLanguge.replaceAll("C++","c++ is a middle progrmming language"));
        System.out.println(computerLanguge.replaceAll(" ","this langugae is not here "));

    }





}
