public class Print2DArray {
    public static void main(String[] args) {
       // Write a program to print values from a 2D array

       double [][] arif={
            {1.4,2.0,3.2,2.0},
            {4.0,1.5,6.1,1.0},
               {1.2,3.1,4.0,1.6 },

        };
       for(double[]numbers:arif){
           for(double i: numbers){
               System.out.print(i+" ");
           }
           System.out.println();
       }











    }
}
