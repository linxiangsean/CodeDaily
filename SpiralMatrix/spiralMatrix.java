import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

class spiralMatrix{
    public static void main(String[] args) {

            int[][] matrix = {{1,2,3},
                              {4,5,6},
                              {7,8,9}};
            
            System.out.println(solveSpiral(matrix).toString());

    }

    public static List<Integer> solveSpiral(int[][] matrix){

        List<Integer> res = new ArrayList<Integer>();

        if(matrix == null || matrix.length == 0){
            return res;
        }

        int rowBeg = 0;
        int rowEnd = matrix.length-1;
        int colBeg = 0;
        int colEnd = matrix[0].length-1;
        
        while(rowBeg <= rowEnd && colBeg <= colEnd){

            //traverse right ---->
            for(int j = colBeg ; j <= colEnd ; j++){
                res.add(matrix[rowBeg][j]);
            }
            rowBeg++;

            //traverse down
            for(int i = rowBeg; i <= rowEnd ; i++){
                res.add(matrix[i][colEnd]);
            }
            colEnd--;

            //traverse left
            if(rowBeg <= rowEnd){
                for(int j = colEnd ; j >=colBeg ; j--){
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;

            //traverse up
            if(colBeg <= colEnd){
                for(int i = rowEnd; i >= rowBeg ; i--){
                    res.add(matrix[i][colBeg]);
                }
            }
            colBeg++;

        }

        return res;
    }
}