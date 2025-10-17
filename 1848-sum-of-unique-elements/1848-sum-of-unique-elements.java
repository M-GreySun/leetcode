class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap <Integer, Integer> freq= new HashMap <Integer, Integer>();

        for(int ele: nums){
            if(freq.containsKey(ele)){
                sum= freq.get(ele).equals(1)? sum-ele: sum;
                freq.put(ele, 2);
            }
            else{
                freq.put(ele,1);
                sum+=ele;
            }
        }
        return sum; 
    }
}