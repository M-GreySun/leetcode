class Solution {
    public long zeroFilledSubarray(int[] nums) {
        //Subarray Formual: n * (n+1)/2
        //Googled
        
        long sum= 0; 
        long length=0;
        int index=0;
        while(index< nums.length){
            while(index< nums.length && nums[index]==0){
                length++;
                index++;
            }
            if(length!=0){
                sum+= length * (length+1) /2;
                length=0;
            }
            index++;
        }
    
        return sum;
    }
}