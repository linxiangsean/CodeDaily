class palindromeNum{
        public static void main(String[] args) throws Exception {
            int num = 101;

            System.out.println(solution(num));
        }

        public static boolean solution(int num){
            if(num < 0) return false;

            int cur = num;
            int remain;
            int result = 0;
            while(cur !=0){
                //get the last digit of this num
                remain = cur%10;
                //make it a valid number with adding 
                result = remain + result*10;
                //clear the last digit of current number
                //int operation will get rid of whatever after .
                cur = cur/10;
            }

            return (result == num);


        }



}