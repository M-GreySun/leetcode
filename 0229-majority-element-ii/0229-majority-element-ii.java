class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer, Integer> freq= new HashMap <Integer, Integer> ();
        for(int ele: nums){
            if(freq.containsKey(ele)){
                freq.put(ele, freq.get(ele)+1);
            }
            else{
                freq.put(ele, 1);
            }
        }
        List <Integer> ans= new ArrayList <Integer> ();
        for(Map.Entry<Integer, Integer> ele: freq.entrySet()){
            if(ele.getValue()>nums.length/3){
                ans.add(ele.getKey());
            }
        }

        return ans;
        
    }
}