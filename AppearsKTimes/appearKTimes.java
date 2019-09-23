import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//The function is supposed to return an integer representing the element that
//occurs k times in the given array.
//if more than one element occurs k times.
//return the largest one and if no element occurs k times,
//return -1
class appearKTimes{
    public static void main(String[] args) {
        
        int[] nums = {2,3,4,2,4,3,2,5,3,5};
        int size = nums.length;
        //return the element that appears k times:
        int k = 3;
        //in this case should return '2'

        //we can use hashmap, store it in to the hashmap with key: int, value: count
        //return the specified count == k, 
        //if there are more than one, return max.
        System.out.println(appear(size,nums,k));

    }

    public static int appear(int size, int[] arr, int k){

        Map<Integer, Integer> hm = new HashMap<>();

        //put everything into the hm:
        for(int i : arr){
            hm.put(i , hm.getOrDefault(i, 0)+1);
        }

        int res = -1;
        for(int i = 0; i < size; i++){
            if(hm.get(arr[i]) == k){
                res = Math.max(res, arr[i]);
            }
        }
        return res;




    }
}