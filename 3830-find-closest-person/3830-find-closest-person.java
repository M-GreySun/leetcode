class Solution {
    public int findClosest(int x, int y, int z) {
        int one= Math.abs(z-x);
        int two=Math.abs(z-y);

        if(one== two){
            return 0;
        }

        return one<two? 1: 2;
    }
}