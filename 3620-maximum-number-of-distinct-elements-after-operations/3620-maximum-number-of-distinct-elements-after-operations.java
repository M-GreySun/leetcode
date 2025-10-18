class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        int last= Integer.MIN_VALUE;

        for(int ele: nums){
            int min=ele-k;
            int max=ele+k;
            if(last<min){
                last=min;
                ans++;
            }
            else if(last<max){
                last++;
                ans++;
            }
        }


        return ans;
    }
}