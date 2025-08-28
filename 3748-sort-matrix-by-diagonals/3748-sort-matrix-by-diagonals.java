class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int row;
        int col;
        PriorityQueue <Integer> sorted= null;

        for(int i=0; i< grid.length*2-1; i++){
            if(i<grid.length){
                row= grid.length-i-1;
                col= 0;
            }
            else{
                row=0;
                col=1+ i- grid.length;
            }
            if(i==0){
                sorted= new PriorityQueue<Integer> ((a,b) -> (b-a));
            }
            else if(i==grid.length){
                sorted= new PriorityQueue <Integer> ();
            }
            int tempRow=row;
            int tempCol=col;
            while(row< grid.length && col<grid.length){
                sorted.offer(grid[row][col]);
                row++;
                col++;
            }
            while(tempRow<grid.length && tempCol< grid.length){
                grid[tempRow][tempCol]= sorted.poll();
                tempRow++;
                tempCol++;
            }
            
        }

        return grid;
        
    }
}