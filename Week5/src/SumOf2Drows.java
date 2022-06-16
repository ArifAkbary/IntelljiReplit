public class SumOf2Drows {
    public static void main(String[] args) {
        int [][] z={
                {1,1,2},//4
                {3,1,2},//6
                {3,5,3},//11
                {0,1,2}//3
        };

        int row, row1, co,co1;
        row =z.length;
        row1=z[0].length;

        for(int i=0; i<row; i++){
            co=0;
            for(int j=0; j<row1; j++){
                co=co+z[i][j];
            }
            System.out.println(co);
        }





    }
}
