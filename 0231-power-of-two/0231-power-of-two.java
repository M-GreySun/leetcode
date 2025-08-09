class Solution {
    public boolean isPowerOfTwo(int n) {
        String bin= Integer.toBinaryString(n);
        System.out.println(bin);
        int count=0;
        for(int i=0; i< bin.length(); i++){
            count= bin.charAt(i)== '1'? count+1: count;
            if(count>1 || n<=0){
                return false;
            }
        }
        return true;   
    }
}