class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List <Integer> ans= new ArrayList <Integer> ();

        int top=0;
        int bot= matrix.length-1;

        int left=0;
        int right= matrix[0].length-1;

        while(top<=bot && left<=right){
            for(int i=left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            if(top>bot || left>right){
                return ans;
            }

            for(int i=top; i<=bot; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top>bot || left>right){
                return ans;
            }

            for(int i=right; i>=left; i--){
                ans.add(matrix[bot][i]);
            }
            bot--;
            if(top>bot || left>right){
                return ans;
            }

            for(int i=bot; i>=top; i--){
                ans.add(matrix[i][left]);
            }
            left++;
            if(top>bot || left>right){
                return ans;
            }

        }

        return ans;
        
    }
}