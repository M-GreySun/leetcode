class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int []ans= new int [mat.length * mat[0].length];
        boolean up= true;
        int row=0;
        int col=0;
        for (int index=0; index< ans.length; index++){
            ans[index]=mat[row][col];
            
            if(up && row==0 && col<mat[row].length-1){
                col++;
                up=false;
            }
            else if (up && row>0 && col<mat[row].length-1){
                row--;
                col++;
            }
            else if(up && col==mat[row].length-1){
                row++;
                up=false;
            }
            else if(!up && row<mat.length-1 && col>0){
                row++;
                col--;
            }
            else if(!up &&  row<mat.length-1 && col==0){
                row++;
                up=true;
            }
            else if(!up && row==mat.length-1){
                col++;
                up=true;
            }
        }

        return ans;        
    }
}