class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);

        int bot=0;
        int top= nums.length -1;
        while(bot<= top){
            int mid=bot + (top-bot)/2;
            if(nums[mid]== original){
                top= nums.length-1;
                bot=mid+1;
                original*=2;
            }
            else if(nums[mid]<original){
                bot=mid+1;
            }
            else{
                top=mid-1;
            }
        }
        return original; 
    }
}