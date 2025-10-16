class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer, Integer> freq= new HashMap <Integer, Integer> ();
        List <Integer> ans= new ArrayList <Integer> ();
        int limit= nums.length/3;
        for(int ele: nums){
            if(freq.containsKey(ele)){
                freq.put(ele, freq.get(ele)+1);
            }
            else{
                freq.put(ele, 1);
            }
            if(!ans.contains(ele) && freq.get(ele)>limit){
                ans.add(ele);
            }
        }
        return ans;  
    }
}