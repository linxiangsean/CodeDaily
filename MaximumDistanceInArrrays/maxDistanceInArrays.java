import java.util.Arrays;
import java.util.List;


class maxDistanceInArrays{
    public static void main ( String[] args){
      

        List<Integer> lis1  = Arrays.asList(1,2,3,7,9);
        List<Integer> lis2  = Arrays.asList(4,5);
        List<Integer> lis3  = Arrays.asList(2,3);

        List< List<Integer>> arrays = Arrays.asList(lis1,lis2,lis3);

        //print out list of lists
        System.out.println(arrays.toString());
        



        int result  = Integer.MIN_VALUE;

        int max = arrays.get(0).get(arrays.get(0).size()-1);
        int min = arrays.get(0).get(0);


        //i must start from 1, it ensures that the calculatioin doesnt compare with it self.
        for(int i = 1 ; i < arrays.size() ; i++){
            System.out.println(arrays.get(i).toString());
            
            result = Math.max(result, Math.abs(arrays.get(i).get(0) - max));
            result = Math.max(result, Math.abs(arrays.get(i).get(arrays.get(i).size()-1) - min));
            
            //keep track of current smallest and largest integers
                 min = Math.min(min, arrays.get(i).get(0));
                 max = Math.max(max, arrays.get(i).get(arrays.get(i).size()-1));

                // System.out.println("smallest of this list is: " + smalest);
                // System.out.println("biggest of this list is: " + large);

        }

        System.out.println("result is: " + result);


        
        
       
       
        


    }

}