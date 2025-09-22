class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=0;
        int count=0;

        HashMap <Integer, Integer> values= new HashMap <Integer, Integer> ();

        for(int ele: nums){
            if(values.containsKey(ele)){
                values.put(ele, values.get(ele)+1);
            }
            else{
                values.put(ele, 1);
            }
            if(max< values.get(ele)){
                max=values.get(ele);
                count=1;
            }
            else if(max==values.get(ele)){
                count++;
            }
        }


        return max *count;
        
    }
}