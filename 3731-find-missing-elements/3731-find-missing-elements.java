class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List <Integer> ans = new ArrayList <Integer> ();
        int min= nums[0];
        int max = nums[0];
        int [] temp = new int [100];

        for(int ele: nums){
            min= min>ele? ele: min;
            max= max<ele? ele: max;
            temp[ele -1]= ele;
        }
        for(int i=min-1; i<max; i++){
            if(temp[i]==0){
                ans.add(i+1);
            }
        }

        
        return ans;
        
    }
}