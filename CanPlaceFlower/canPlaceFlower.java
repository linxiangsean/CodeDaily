class canPlaceFlower{
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};

        int n = 1;


        int i =0, count =0;

        //consider the corner cases:
        if(flowerbed == null || flowerbed.length == 0){
            System.out.println("false");
        }

        while( i < flowerbed.length ){
            if(flowerbed[i] == 0 && ( i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)){

                flowerbed[i] = 1;
                count++;
                
            }

            if(count >= n){
                System.out.println("true");
            }

            i++;
        }

            System.out.println("false");
    






        // //mark all possible spots
        // for(int i = 0 ; i < flowerbed.length; i++){

        //     //when its beginning, check next one only,
        //     if(i == 0){
        //         if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
        //             flowerbed[i] = 2;
        //         }
        //         continue;
        //     }

        //     if(i == flowerbed.length-1){
        //         if(flowerbed[i] == 0 && flowerbed[i-1] == 0){
        //             flowerbed[i] = 2;
        //         }
        //         continue;
        //     }

        //     //when its somehting in the middle, check both the left and the right

        //     if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
        //         flowerbed[i] = 2;
        //     }
        // }

        // int count = 0;

        // for(int i =0; i < flowerbed.length ; i++){
        //     if(flowerbed[i] == 2){
        //         count++;
        //     }
        // }

        // if(count >= n){
        //     System.out.println(true);
        // }else{
        //     System.out.println(false);
        // }

    }
}