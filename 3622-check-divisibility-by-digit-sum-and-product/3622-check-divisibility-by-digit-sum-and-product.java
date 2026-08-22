class Solution {
    public boolean checkDivisibility(int n) {
        int sum= 0;
        int prod =1;

        for(int temp=n; temp!=0; temp/=10){
            sum+=temp%10;
            prod*=temp%10;
        }
        return n % (sum+prod) == 0;
    }
}