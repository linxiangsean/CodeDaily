class distinctElementCount{
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,4,4,5};
        int size = nums.length;
        System.out.println(solution(size, nums));
    }


    //the method returns the count of the unique elements in an array:
    //foe example: {1,2,3,1,4,4,5}, unique elements are 1,2,3,4,5 --> count = 5;
    //'not mean the num that only appear once!!!!'
    public static int solution(int size, int[] nums){

        int[] counted = new int[size];

        int count;
        int flag;

        //initialize the firt element in the counted list:
        counted[0] = nums[0];
        count = 1;//already one counted

        for(int i = 0; i < size ; i++){
            flag = 0;
            for(int j = 0 ; j < count; j++){
                //compare,dude, please compare!!!!!
                // the counted list with nums
                //if they are the same, make flag 1,
                //dont count it, and do nothing,
                if(nums[i] == counted[j]) flag = 1;
                
            }

            //if flag is 0; which it is not shwoing in the counted list,
            //it is an unique elelent!, increment count and add intot he counted list
            if(flag == 0){
                counted[count] = nums[i];
                count++;
            }
        }

        return count;

    }

}