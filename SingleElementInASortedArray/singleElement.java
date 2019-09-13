class singleElement{
//---Single Element in a Sorted Array

// Given a sorted array consisting of only integers where every element appears twice 
//except for one element which appears once. Find this single element that appears only once.

// Example 1:
// Input: [1,1,2,3,3,4,4,8,8] Output: 2
// Example 2:
// Input: [3,3,7,7,10,11,11] Output: 10
// Note:
// Your solution should run in O(log n) time and O(1) space.
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};

        System.out.println(solveSingleE(nums));


    }

    public static int solveSingleE(int[] nums){

        int start = 0 ; 
        int end = nums.length-1;

        while(start < end){

            int mid = (start + end)/2;
            
            //if mid % 2 ==1 is true, mid is odd, move it to left since the single element can only checked when mid is at left of a pair.
            if( mid % 2 ==1 ) mid--;

            if(nums[mid] != nums[mid+1]){
                // we didnt find a pair
                //in this situation, single ele is at left half.
                //make end to the mid.
                end = mid;
            }else{
                //we find a pair, the single ele is at right half
                start = mid + 2;
            }
        }
        
        return nums[start];
    }


}