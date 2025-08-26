class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area= 0;

        double diagonal= 0;
        for(int [] dim: dimensions){
            double temp= Math.sqrt(Math.pow(dim[0],2)+ Math.pow(dim[1],2));
            if(temp>diagonal){
                area=dim[0]*dim[1];
            }
            else if(temp==diagonal){
                area=Math.max(area, dim[0]* dim[1]);
            }
            diagonal= temp>=diagonal? temp: diagonal;
        }

        return area;
    }
}