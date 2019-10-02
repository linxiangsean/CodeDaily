class countDiceSequence{

    
    public static void main(String[] args) {
        int N = 2;
        int N2 = 10;
        int[] rollMax1 = { 1, 2, 1, 2, 1, 2 };
        int[] rollMax2 = { 1, 1, 1, 1, 1, 1 };

        System.out.println("Possibilities: " + countDice(N2, rollMax2));

    }

    static int res = 0;

    public static int countDice(int N, int[] rollMAX) {
        if (N == 0)
            return 0;
        helper(0, -1, 0, rollMAX, N);
        return res;
    }

    private static void helper(int step, int lastseen, int counter, int[] rollMAX, int N) {
        if (step == N) {
            res++;
            return;
        }
        for(int i = 1 ; i <= 6 ; i++){
            // need check last seen;
            if(i != lastseen && rollMAX[i-1]>0){
                //safe to add;
                helper(step+1,i,1,rollMAX,N);
            }
            else{
                if(counter<rollMAX[lastseen-1]){
                    //safe to add one more
                    helper(step+1,lastseen,counter+1,rollMAX, N);
                }
            }
        }
    }

     
    // public static void helper(List<List<Integer>> res, List<Integer> Temp, int N, int[] dice){
    //     if(Temp.size() == N){
    //         res.add(new ArrayList<>(Temp));
    //     }else{
    //         for(int i = 0 ; i < N ; i++ ){
    //             for(int x : dice){
    //                 if()
    //             }


    //         }
    //     }

    // }

}