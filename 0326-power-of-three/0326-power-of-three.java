class Solution {
    public boolean isPowerOfThree(int n) {
        if((n<=0 || n%3!=0) && n!=1){
            return false;
        }
        return n==1? true: isPowerOfThree(n/3);
        
    }
}