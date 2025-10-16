class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer, Integer> freq= new HashMap <Integer, Integer> ();
        List <Integer> ans= new ArrayList <Integer> ();
        for(int ele: nums){
            if(freq.containsKey(ele)){
                freq.put(ele, freq.get(ele)+1);

            }
            else{
                freq.put(ele, 1);
            }
            if(!ans.contains(ele) && freq.get(ele)>nums.length/3){
                ans.add(ele);
            }
        }
        

        return ans;
        
    }
}