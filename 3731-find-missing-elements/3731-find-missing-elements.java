class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List <Integer> ans = new ArrayList <Integer> ();
        Arrays.sort(nums);
        int min= nums[0];
        int max = nums[nums.length -1];

        int i=1;
        while (i<nums.length){
            if(min+ 1== nums[i] ){
                min= nums[i];
                i++;
            }
            else{
                ans.add(min +1);
                min+=1;
            }
        }


        return ans;
        
    }
}