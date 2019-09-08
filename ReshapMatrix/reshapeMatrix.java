import java.util.Arrays;

class reshapeMatrix{
    public static void main(String[] args) {
        int[][] nums = {{1,2}, 
                        {3,4}};

        //check if the required shape exists

        int r = 1;
        int c = 4;
        

        //In this solution we will use extra space.
        //get the size of original matrix
         int size = nums[0].length * nums.length;
         System.out.println("size : " + size);

         //if not legal and not possible:
         if(size > r*c){
            System.out.println("The target matrix is not large enough.");
        }

        //create target space:
        int[][] output = new int[r][c];
        //create a 1d array;
        int[] oneDArray = new int[size];

         
        //1d array indexer
        int index = 0;
        //traverse the 2d matrix, convert 2d to 1d.
        for(int i = 0; i < nums.length; i++){
            for(int j =0; j < nums[0].length; j++ ){
                int curNum = nums[i][j];
                oneDArray[index] = curNum;
                index++;
            }
        }

        index = 0;
        //fill new matrix with order:
        for(int i = 0; i < r; i++){
            for(int j = 0; j< c ; j++){
                output[i][j] = oneDArray[index];
                index++;
            }
        }

        System.out.println("new matrix is: ");

        System.out.print("[");
       for(int[] rowl : output){
           System.out.println(Arrays.toString(rowl));
       }
       System.out.print("]");

    }
}