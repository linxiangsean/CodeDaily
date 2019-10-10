import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class sumOfUniqueFiboNums{

static boolean  flag = false;
    public static void main(String[] args) {
        int x = 10059560;
        int n = 4;

        ArrayList<Integer> nums = new ArrayList<>();
        comuputFibo(nums, x);
        nums.remove(0);
        nums.remove(0);

        System.out.println(nums);
        helper(nums,0,x,0,0,n);
        System.out.println(flag);

    }

private static void helper(List<Integer>nums, int sum, int target,int index, int step, int n){
        // stringbuilder sb
        if(flag)return;
        if(index >= nums.size() ||  sum > target  ||step > n){
          return;
        }
        if(sum == target && step == n){
          flag = true;
          return;
        }
        helper(nums,sum,target,index+1,step,n);//not pick
        //branch 2
        helper(nums,sum+nums.get(index),target,index+1,step+1,n);
    }


public static void comuputFibo(ArrayList<Integer> nums, int x){
   int i = 3, nextTerm = 0;

   nums.add(0);
   nums.add(1);
   nums.add(1);

    while(true){
        nextTerm = nums.get(i-1) + nums.get(i-2);
        if(nextTerm > x) return;
        nums.add(nextTerm);
        i++;
    }
}


}