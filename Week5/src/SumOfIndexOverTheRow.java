public class SumOfIndexOverTheRow {
    public static void main(String[] args) {

        int [][] x={
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int even=0;
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x.length-1; j++){
                if(x[i][j]%2==0){
                   even+=x[i][j];

                }
            }
        }
        System.out.println(even);







    }
}
