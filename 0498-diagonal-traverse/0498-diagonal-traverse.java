class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int []ans= new int [mat.length * mat[0].length];
        boolean up= true;
        int row=0;
        int col=0;
        for (int index=0; index< ans.length; index++){
            //System.out.println("The index: "+ index + "\tThe value added: "+ mat[row][col]);
            ans[index]=mat[row][col];
            
            if(up && row==0 && col<mat[row].length-1){
                //System.out.println("First if");
                col++;
                up=false;
            }
            else if (up && row>0 && col<mat[row].length-1){
                //System.out.println("Second if");
                row--;
                col++;
            }
            else if(up && col==mat[row].length-1){
                //System.out.println("Third if");
                row++;
                up=false;
            }
            else if(!up && row<mat.length-1 && col>0){
                //System.out.println("Fourth if");
                row++;
                col--;
            }
            else if(!up &&  row<mat.length-1 && col==0){
                //System.out.println("Fifth if");
                row++;
                up=true;
            }
            else if(!up && row==mat.length-1 && col<mat[row].length-1){
                //System.out.println("Sixth if");
                col++;
                up=true;
            }
        }

        System.out.println("\n"+ Arrays.toString(ans));

        return ans;        
    }
}