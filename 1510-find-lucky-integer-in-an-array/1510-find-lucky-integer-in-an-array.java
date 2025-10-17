class Solution {
    public int findLucky(int[] arr) {
        int ans=-1;
        HashMap <Integer, Integer> freq= new HashMap <Integer, Integer> ();

        for(int ele: arr){
            if(freq.containsKey(ele)){
                freq.put(ele, freq.get(ele)+1);
            }
            else{
                freq.put(ele, 1);
            }
        }
        for(Map.Entry <Integer, Integer> ele: freq.entrySet()){
            if(ele.getKey().equals(ele.getValue()) && ele.getKey()>ans){
                ans=ele.getKey();
            }
        }
        return ans;
    }
}