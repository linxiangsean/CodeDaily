class threeLargestProduct{
    public static void main(String[] args) {
        int[] nums  = {-4,-4,-5,-6,-7,-8};

        System.out.println(maximum_product_of_three_n(nums));
    }


    //BRUTE FORCE SOLUTION, o(N^3)
    public static int maximum_product_of_three_BRUTE_FORCE(int[] nums){

        int result = Integer.MIN_VALUE;
        int prod = 0;
        for(int i = 0; i < nums.length - 2 ; i++ ){
            for(int j = i+1 ; j < nums.length-1 ; j++){
                for(int k = j+1; k <nums.length ; k++){
                    prod = nums[i] * nums[j] * nums[k];
                    result = Math.max(result, prod);
                }
            }
        }

        return result;
    } 

    public static int maximum_product_of_three_n(int[] nums){

        int max1 =  Integer.MIN_VALUE;
        int max2 =  Integer.MIN_VALUE;
        int max3 =  Integer.MIN_VALUE;

        int min1 =  Integer.MAX_VALUE;
        int min2 =  Integer.MAX_VALUE;

        for(int n : nums){
            if(n > max1){
                max3 = max2;
                max2 = max1;
                max1 = n;
            }else if(n > max2){
                max3 = max2;
                max2 = n;
            }else if( n > max3){
                max3 = n;
            }

            if(n < min1){
                min2 = min1;
                min1 = n;
            }else if(n < min2){
                min2 = n;
            }
        }

        return Math.max(max1*max2*max3, min1*min2*max1);
    }

}