class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {

        int [][] array= new int [n][n];
        for(int [] ele: queries){
            for(int i=ele[0]; i<=ele[2]; i++){
                array[i][ele[1]]++;
                if(ele[3]+1<n){
                    array[i][ele[3]+1]--;
                }
            }
        }
        for(int i=0; i<n; i++){
            for (int j=1; j< n; j++){
                array[i][j]=array[i][j]+ array[i][j-1];
                //System.out.println("Array [" + i+"][" +j+ "]= "+ array[i][j]);
            }
        }
        return array;
    }
}