class Solution {
    public int maximum69Number (int num) {

        int pow=-1;

        int count=0;
        int temp=num;

        while(num!=0){
            int digit=num%10;
            if(digit==6){
                pow=count;
            }
            count++;
            num/=10;
        }
        
        return temp + ((int)Math.pow(10,pow))*3;
        
    }
}