class sellBook{
    public static void main(String[] args) {
        int n = 4;
        int m = 8;
        int x = 4;
        int y = 3;

        System.out.print(barterMarket(n,m,x,y));

    }

    public static int barterMarket(int n, int m, int x, int y){
        
        int res = 0;
        while(n >= 1 && m >= x){
                res++;
                n--;
                m = m-x;
                while(m < x && n>=1){
                    m = m + y;
                    n--;
                }
        }
        return res;


    }



}