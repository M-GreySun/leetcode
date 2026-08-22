class Solution {
    public int largestInteger(int[] nums, int k) {
        int ans= -1;

        int [] values= new int [51];
        for(int ele: nums){
            values[ele]++;
        }
        if (k==1){
            for(int i=values.length-1; i>=0; i--){
                if(values[i]==1){
                    ans=i;
                    break;
                }
            }
        }
        else if(k== nums.length){
            for(int ele: nums){
                ans= Math.max(ans, ele);
            }
        }
        else{
            
            if(values[nums[0]]==1 && values[nums[nums.length-1]]==1){
                ans= Math.max(nums[0], nums[nums.length-1]);
            }
            else{
                ans= values[nums[0]]==1? nums[0]: ans;
                ans= values[nums[nums.length-1]] ==1 ? nums[nums.length-1]: ans;
            }
        }
        return ans;
    }
}