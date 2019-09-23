import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;


class topKFreqElement{
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        System.out.println(topKFrequent(nums,k));
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        
        List<Integer> res = new ArrayList<>();
        
        List<Integer>[] bucket = new List[nums.length+1];
        
        
        //put into hm key:num, value: frequency
        Map<Integer, Integer> hm = new HashMap<>();
        for(int n : nums){
            hm.put(n , hm.getOrDefault(n, 0) +1);
        }
        
        //go through keyset, but the key in to designated freq spot in the bucket:
        for(int key : hm.keySet()){
            int freq = hm.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        
        //loop through the bucket from back to front,
        //make sure these are the most freq ones
        //and get the top k.
        //res.size() cannot be <= k 
        //because when res.size() == k, it cannot take in any.
        //so res.size() has to be smaller than k.!!
        for(int i = bucket.length -1 ; i >= 0 && res.size() < k ; i--){
            if(bucket[i] != null ){
                res.addAll(bucket[i]);
            }
        }
        
       
        return res;
    }

}