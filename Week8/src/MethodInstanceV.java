public class MethodInstanceV {

String school;
int year;
int clas;

void printinformation(String school, int year,int clas){

    System.out.println("I was a smart student in "+school+" in kabul year was"+year+" i was in the "+clas+"class");

}


    public static void main(String[] args) {
        MethodInstanceV methodInstanceV=new MethodInstanceV();

        methodInstanceV.printinformation("Maryim high school ",1996,3);
    }


}
