class Solution {
    public String largestGoodInteger(String num) {
        String max= "";

        for(int i=0; i+2<num.length(); i++){
            if((num.charAt(i)== num.charAt(i+1)) && (num.charAt(i)== num.charAt(i+2))){
                if(max.equals("")|| max.charAt(0)< num.charAt(i)){
                    max=num.substring(i, i+3);
                }
            }
        }
        return max;        
    }
}