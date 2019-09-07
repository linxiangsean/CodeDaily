class movezeros{
    public static void main (String[] args){
        //move in place one iteration
        int[] nums = {0,0,0,2,0,1,3,4,0,0};

        //corner cases:
        if(nums == null || nums.length == 0){
            System.out.println("input is null or zero");
        }

        

        int insertPos = 0;
        for(int i =0  ; i< nums.length; i++){
            if(nums[i] != 0){
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        while(insertPos < nums.length){
            nums[insertPos] = 0;
            insertPos++;
        }

        //print array
        for(int i =0; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}