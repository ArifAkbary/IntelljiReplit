public class Varibles {

    int num1;
    double b;
    int num2;
    char s;
    char a;



    void printalltwo (int num1, double b, int num2,char s, char a){
        System.out.println(num1);
        System.out.println(b);
        System.out.println(s);
        System.out.println(a);


    }

    public static void main(String[] args) {
        Varibles varibles=new Varibles();
        varibles.printalltwo(150,12.90,130,'F','G');

    }


}
