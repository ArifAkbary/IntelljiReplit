public class SumOf2DArray {
    public static void main(String[] args) {

        int [][] x= {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int sum=0;
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length; j++){
                sum+=x[i][j];

            }
        }
        System.out.println(sum);






    }
}
