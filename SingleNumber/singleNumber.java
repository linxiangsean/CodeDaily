import java.util.Map;
import java.util.HashMap;

class singleNumber{
    public static void main(String[] args) {

        Solution sl = new Solution();
        
        //arr is non-empty and follows the rule
        int[] arr = {1,1,2};

        System.out.println(sl.singleNumberUsingXOR(arr));
    }


}

class Solution{
    public int singleNumberUsingHm(int[] nums){
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i : nums){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }

        for(int i : nums){
            if(hm.get(i) == 1){
                return i;
            }
        }

        return -1;
    }

    public int singleNumberUsingXOR(int[] nums){

        int res = 0;

        for(int i:nums){
            res = res ^ i;
        }

        return res;


    }
}