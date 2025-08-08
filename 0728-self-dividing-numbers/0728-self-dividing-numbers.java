class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List <Integer> ans= new ArrayList <Integer> ();

        for(int i=left; i<= right; i++){
            if(i%10!=0 && dividesTest(i)){
                ans.add(i);
            }
        }
        return ans;
    }


    public boolean dividesTest(int num){

        int temp=num;
        while(temp>0){
            int digit= temp%10;
            if(digit==0 || num%digit!=0 ){
                return false;
            }
            temp/=10;
        }
        return true;
    }
}