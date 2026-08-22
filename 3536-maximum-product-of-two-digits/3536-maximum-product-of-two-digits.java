class Solution {
    public int maxProduct(int n) {
        int one =0;
        int two =0;

        for( ; n!= 0; n/=10){
            if(one< n%10){
                two=one;
                one=n%10;
            }
            else if(two < n%10){
                two= n%10;
            }
        }
        return one *two;  
    }
}