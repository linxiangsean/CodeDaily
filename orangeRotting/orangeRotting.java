import java.util.LinkedList;
import java.util.Queue;

class orangeRotting{
    public static void main(String[] args) {
        int[][] bucket = {{2,1,1},{0,1,1},{1,0,1}};

        System.out.println(orangesRotting(bucket));
    }
    public static int orangesRotting(int[][] grid) {
        
        
        //loop, put all fresh oranges into a queue
        
        if(grid == null || grid.length == 0) return 0;
        Queue<int[]> queue = new LinkedList<>();
        int count_fresh = 0;
        //put positions of all rotten oranges in queue, count the number of fresh oranges
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0; j <grid[0].length ; j++){
                if(grid[i][j] == 2){
                    //put rotten oranges into queue
                    queue.offer(new int[]{i,j});
                }else if(grid[i][j] == 1){
                    //count fresh oranges
                    count_fresh++;
                }
            }
        }
        //if no fresh oranges, no need to rotten, return 0
        if(count_fresh == 0){
            return 0;
        }
        
        int count = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        //bfs start from the initially rotten oranges
        //here we make fresh count > 0 because when there is last one fresh, we already rotten it.
        //no need to go in loop one more time.
        while(!queue.isEmpty() && count_fresh >0){
        
            //one rotting process
            //add one minute
            count++;
            int size = queue.size();
            for(int i = 0 ; i < size ; i++){
                //get the rotten orange position at head,also remove it from queue
                int[] currentRotten = queue.poll();
                for(int[] dir : dirs){
                    //loop through four directions:
                    
                    //get the x,y cordinations of this step,among up, down, left, or right:
                    int x = currentRotten[0] + dir[0];
                    int y = currentRotten[1] + dir[1];
                    
                    //if x or y is out of bound do nothing
                    if( x<0 || y<0 || x>=grid.length | y >=grid[0].length) continue;
                    
                    //only when the orange is frsh, we rot it and put it into rottened queue:
                    if(grid[x][y] == 1){
                         grid[x][y] = 2;
                    //put new rottened one into the queue
                    queue.offer(new int[]{x,y});
                    //fresh orange reduce
                    count_fresh--;
                    }
    
                }
            }
            
        }
        
        if(count_fresh == 0){
            return count;
        }else{
            return -1;
        }
    }
}