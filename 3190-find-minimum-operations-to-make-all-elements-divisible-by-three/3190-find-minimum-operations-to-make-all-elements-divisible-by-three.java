class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;

        for(int ele: nums){
            count=ele%3!=0? count+1: count;
        }
        return count;
        
    }
}