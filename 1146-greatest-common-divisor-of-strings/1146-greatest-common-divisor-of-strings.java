class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if(!(str1+ str2).equals(str2+str1)){
            return "";
        }
        String min= str1.length()<=str2.length()? str1: str2;

        for(int i=0; i<min.length(); i++){
            String store= min.substring(0,min.length()-i);
            String temp= store;
            boolean one=false;
            boolean two= false;
            while(temp.length()<=(str1+str2).length()){
                if(temp.equals(str1)){
                    one=true;
                }
                if(temp.equals(str2)){
                    two=true;
                }
                if(one && two){
                    return store;
                }
                temp+=store;
            }
        }
        return "";        
    }
}