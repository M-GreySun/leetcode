class Solution {
    public long sumAndMultiply(int n) {

        long ans=0;
        int count=0;
        int x=0;
        for(; n!=0 ; n/=10){
            if(n%10 != 0){
                x+= n%10;
                ans+= n%10 * (int)Math.pow(10, count);
                count++;
            }
        }
        
        return ans * x;
    }
}