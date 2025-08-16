class Solution {
    public int maximum69Number (int num) {

        int pow=-1;
        int temp=num;

        for(int i=0; i<4 && num!=0; i++){
            int digit=num%10;
            if(digit==6){
                pow=i;
            }
            num/=10;
        }
        
        return temp + ((int)Math.pow(10,pow))*3;  
    }
}