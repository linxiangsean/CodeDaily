import java.util.Arrays;

class removeDup{
    public static void main(String[] args) {
        //int[] nums = {0,0,1,1,1,2,2,3,3,4};
        //int[] nums = {0};
        int[] nums = {1,1,1,1};
        System.out.println("Original array is: " + Arrays.toString(nums));

        int newLength = removeDuplicates(nums);

        System.out.print("New array is: ");
        for(int i = 0 ; i < newLength ; i++){
            System.out.print(nums[i] + ", ");
        }

    }

    public static int removeDuplicates(int[] nums) {
        
        if(nums.length == 0 || nums == null){
            return 0;
        }
        
        int slowP = 0;
        
        for(int fastP = 0 ; fastP < nums.length ; fastP++ ){
            if(nums[fastP] != nums[slowP]){
                slowP++;
                nums[slowP] = nums[fastP];
            }
        }
        
        return slowP + 1; 
}


}