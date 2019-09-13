class maxSumOfHourglass{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7},{5,6,7,8}};
        System.out.println(hourglassSum(arr));
    }

    public static int hourglassSum(int[][] arr) {
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length-2 ; i ++){
            for(int j = 0 ; j < arr[0].length-2 ; j ++){
                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]
                                    +arr[i+1][j+1]
                            +arr[i+2][j] +arr[i+2][j+1] +arr[i+2][j+2];
                res = Math.max(res, sum);
            }
        }
    return res;
    }
}