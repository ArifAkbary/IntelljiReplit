public class MethodDemo6 {


    int x=20;
    int y=10;

    void print1(){
        System.out.println(x+y);
    }
    int z=10;
    int a=3;
    void print2(){
        System.out.println(z*a);
    }
    int b=30;
    int c=10;
    void print3(){
        System.out.println(b-c);
    }

    public static void main(String[] args) {
        MethodDemo6 math=new MethodDemo6();
        math.print1();
       math.print2();
        math.print3();
    }

}
