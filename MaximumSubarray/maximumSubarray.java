class maximumSubarray{
    public static void main(String[] args) {

        // Given an integer array nums, find the contiguous subarray 
        //(containing at least one number) which has the largest sum and return its sum.

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4}; 

        System.out.println(solution2(nums));


    }


    //This is a brute force solution
    //iterate through the list with two pointers and get all the possible sum of each subarray
    public static int solution1(int[] nums){

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0 ; i < nums.length ; i++){
            sum = 0;
            for(int j = i; j < nums.length ; j++){
                sum = sum + nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static int solution2(int[] nums){
        int maxEnding = nums[0];
        int maxSofar = nums[0];

        for(int i = 1; i < nums.length; i++){
            maxEnding = Math.max(nums[i],nums[i] + maxEnding);
            maxSofar = Math.max(maxSofar, maxEnding);
        }
        return maxSofar;
    }
}