import java.util.HashMap;
import java.util.Map;

class twosum{
    public static void main(String[] args){

        int[] nums = {1,2,3,4,5,6,7,8};
        int target = 10;

        int[] output = twoSumHashMap(nums, target);

        System.out.println("indexes are: " +output[0] + " and " + output[1]);

    }
    public static int[] twoSumBrute(int[] nums, int target){
         // this is O(n^2) solution, relatively slow; we should use 

         int[] res = new int[2];
         for(int i = 0 ; i < nums.length ; i++){
             for(int j = i+1 ; j < nums.length ; j++){
                 if(nums[i] + nums[j] == target){
                     res[0] = i;
                     res[1] = j;
                 }
             }
         }
           return res;
    }

    public static int[] twoSumHashMap(int[] nums, int target){
        // this is O(n^2) solution, relatively slow; we should use 

         //initialize the array
         int[] res = new int[2];
        
         //using hashmap
         
         Map<Integer, Integer> hm = new HashMap<>();
         
         for(int i = 0; i < nums.length ; i++){
             if(hm.containsKey(target - nums[i])){
                 res[0] = hm.get(target - nums[i]);
                 res[1] = i;
             }else{
                 hm.put(nums[i],i);
             }
         }
         return res;
   }


}