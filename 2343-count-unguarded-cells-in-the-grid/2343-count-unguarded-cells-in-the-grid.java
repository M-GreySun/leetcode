class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        /*
            0 - unguarded
            1 - guard
            2 - guarded 
            3 - wall
        */
        int [][] grid= new int [m][n];

        for(int i=0; i<walls.length; i++){
            grid[walls[i][0]][walls[i][1]]=3;
        }
        for(int i=0; i<guards.length; i++){
            grid[guards[i][0]][guards[i][1]]=1;
        }
        for(int i=0; i<guards.length; i++){
            fill(grid, guards[i][0], guards[i][1]);
        }
        int count=0;

        for(int row=0; row<m; row++){
            for(int col=0; col< n; col++){
                count= grid[row][col]==0? count+1: count;
            }
        }
        printGrid(grid);

        return count;
    }

    public void fill(int [][]grid, int row, int col){
        grid[row][col]= 1;
        for(int i=row+1; i<grid.length && (grid[i][col]==0 || grid[i][col]==2); i++){        //Down
            grid[i][col]=2;
        }
        for(int i=row-1; i>=0 && (grid[i][col]==0 || grid[i][col]==2); i--){                 //Up
            grid[i][col]=2;
        }

        for(int i=col+1; i<grid[0].length && (grid[row][i]==0 || grid[row][i]==2); i++){    //Right
            grid[row][i]=2;
        }
        for(int i=col-1; i>=0 && (grid[row][i]==0 || grid[row][i]==2); i--){                 //Left
            grid[row][i]=2;
        }
    }
    public void printGrid(int [][]grid){
        for(int row=0; row<grid.length; row++){
            System.out.println(Arrays.toString(grid[row]));
        }
    }
}