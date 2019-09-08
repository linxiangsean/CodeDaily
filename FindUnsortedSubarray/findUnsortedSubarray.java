import java.util.Arrays;


class findUnsortedSubarray{
    public static void main(String[] args) {
        
        int[] nums = {2,6,4,8,10,9,15};

        System.out.println(Arrays.toString(nums));

        int left = -1;
        int right = -2;



        int[] numsComp = new int[nums.length];
        
        for(int i =0; i < nums.length; i++){
            numsComp[i] = nums[i];
        }
        
        Arrays.sort(numsComp);

        //find the first left one changed:
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != numsComp[i]){
                left = i;
                System.out.println("i is: " + i);
                break;
            }
        }

        //find the first right one changed:
        for(int j = nums.length - 1; j>=0 ; j--){
            if(nums[j] != numsComp[j]){
                right = j;
                System.out.println("j is: " + j);
                break;
            }
        }

        
        int out = right-left+1;

        System.out.println("out put is: " + out);
    }

}
