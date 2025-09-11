class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List <Integer> ans= new ArrayList <Integer> ();
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                if(nums[nums[i]-1]>0){
                    nums[nums[i]-1]*=-1;
                }
            }
            else{
                int index= nums[i]*-1 -1;
                if(nums[index]>0){
                    nums[index]*=-1;
                }
            }
        }
        for(int i=0; i< nums.length; i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans; 
    }
}