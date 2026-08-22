class Solution {
    public int[] resultArray(int[] nums) {

        List <Integer> arr2= new ArrayList <Integer> ();
        arr2.add(nums[1]);
        int [] ans= new int [nums.length];
        ans[0]=nums[0];
        int index=0;
        
        for(int i=2; i<nums.length; i++){
            if (ans[index]> arr2.get(arr2.size() -1)){
                ans[++index]= nums[i];
            }
            else{
                arr2.add(nums[i]);
            }
        }
       
        for(int ele: arr2){
            ans[++index]= ele;
        }

        return ans; 
        
    }
}