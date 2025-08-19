class Solution {
    public String largestGoodInteger(String num) {
        int max=0;
        String str="";
        for (int i=0; i<=num.length()-3; i++){
            String temp= num.substring(i, i+3);
            if (temp.charAt(0)== temp.charAt(1) && temp.charAt(1)== temp.charAt(2)){
                if (max<= Integer.valueOf(temp)){
                    str= temp;
                    max= Integer.valueOf(temp);
                }
            }
        }
        return str;
        
    }
}