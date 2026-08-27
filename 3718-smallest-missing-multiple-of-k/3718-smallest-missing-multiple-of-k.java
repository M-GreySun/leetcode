class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet <Integer> values= new HashSet<Integer> ();

        for(int ele: nums){
            values.add(ele);
        }
        
        for(int i=k; i<= 200; i+=k){
            if(!values.contains(i)){
                return i;
            }
        }

        return k;
        
    }
}