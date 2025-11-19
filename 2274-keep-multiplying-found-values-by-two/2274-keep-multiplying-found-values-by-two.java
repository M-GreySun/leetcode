class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet <Integer> values= new HashSet <Integer> ();
        for(int ele: nums){
            values.add(ele);
        }

        while(values.contains(original)){
            original*=2;
        }

        return original;
        
    }
}