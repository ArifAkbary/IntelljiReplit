public class MehtodReplace {


    void replaceletter(){

        String subject="Computer seince";

        String subject1=" Data equls to information";
        System.out.println(subject.replace('e','*'));
        System.out.println(subject1.replace('i','%'));


    }

    public static void main(String[] args) {
        MehtodReplace methodrep=new MehtodReplace();
        methodrep.replaceletter();
    }



}
