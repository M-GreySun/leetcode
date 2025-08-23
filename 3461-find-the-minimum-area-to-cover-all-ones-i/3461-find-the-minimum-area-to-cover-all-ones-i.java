class Solution {
    public int minimumArea(int[][] grid) {
        int minWidth=grid.length;
        int maxWidth= 0;

        int minHeight= grid.length;
        int maxHeight=0;
        boolean zeroArea= true;

        for(int i=0; i< grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]==1){
                    zeroArea=false;
                    minWidth= Math.min(minWidth, j);
                    maxWidth= Math.max(maxWidth, j);

                    minHeight= Math.min(minHeight, i);
                    maxHeight= Math.max(maxHeight, i);
                }
            }
        }
        return zeroArea? 0: (Math.abs(maxWidth-minWidth)+1) * (Math.abs(maxHeight- minHeight)+1);
    }
}