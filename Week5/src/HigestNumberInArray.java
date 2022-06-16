public class HigestNumberInArray {
    public static void main(String[] args) {


       int [] largeArray={23,56,32,98,78,90,56};

       int largest=largeArray[0];

       for(int i=0; i<7; i++){
           if(largeArray[i]>largest)largest=largeArray[i];

       }

        System.out.println(largest);








    }
}
