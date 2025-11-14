class Solution {
    public boolean isStrictlyPalindromic(int n) {

        String val= Integer.toString(n, n-2);
        System.out.println(val);

        if(val.equals("12") || val.equals(String.valueOf(n))){
            return false;
        }
        for(int i=0; i<val.length()/2; i++){
            if(val.charAt(i)!=val.charAt(val.length()-i-1)){
                return false;
            }
        }
        return true;   
    }
}