class subarraySumEqualK{
    public static void main(String[] args) {
        
    }
    
    public static int subarraySum(int[] nums, int k) {
        //coner case
           if(nums.length == 0 ){
               return 0;
           }
           
           int sum = 0;
           int res = 0;
           
           Map<Integer, Integer> hm = new HashMap<>();
           //put first here, as if there is a value for example: nums[0] == k
           //then, we can have hm[nums[0],1] - hm[0,1] == k
           hm.put(0,1);
           
           for(int i = 0; i <nums.length ; i++){
               
               sum += nums[i];
               
               if(hm.containsKey(sum - k)){
                   res += hm.get(sum-k);
               }
               hm.put(sum, hm.getOrDefault(sum, 0) +1);
           }
           
           return res;
           
       }


}