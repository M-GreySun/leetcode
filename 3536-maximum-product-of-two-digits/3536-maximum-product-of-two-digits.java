class Solution {
    public int maxProduct(int n) {
        int one =0;
        int two =0;

        for(int i=n; i!= 0; i/=10){
            if(one< i%10){
                two=one;
                one=i%10;
            }
            else if(two < i%10){
                two= i%10;
            }
        }
        return one *two;  
    }
}