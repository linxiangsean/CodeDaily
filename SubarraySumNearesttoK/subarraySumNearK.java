import java.util.Map;

class subarraySumNearK{
    public static void main(String[] args) {
        int[] nums = {2, 2, -1, 5, -3, -2};
        int k = 7;

        print(subarraySumNear(nums,k));
    }
    
    public static int[] subarraySumNear(int[] nums, int k) {
        int[] out = new int[2];


        if(nums.length == 0 || nums == null) return out;
    
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == k) {
                out[0] = i;
                out[1] = i;
            }
        }

        int nearestDis = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            int subarray = nums[i];
            for(int j = i+1; j < nums.length; j++){

                subarray += nums[j];
                int thisDis = Math.abs(k-subarray);
                if(thisDis < nearestDis){
                    nearestDis = thisDis;
                    out[0] = i;
                    out[1] = j;
                }
            }
        }
        
        return out;
           
       }

       public static void print(int[] arr){
           for(int x : arr){
            System.out.print(x + " ");
           }
            
       }

}