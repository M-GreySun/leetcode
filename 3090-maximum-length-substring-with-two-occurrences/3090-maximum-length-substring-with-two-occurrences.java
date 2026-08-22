class Solution {
    public int maximumLengthSubstring(String s) {
        int ans= 2;
        int [] letters = new int [26];      //lower case a is 97;
    
        for (int i=0; i< s.length(); i++){
            letters[s.charAt(i)- 97]++;
            for(int j=i+1; j<s.length(); j++){
                //System.out.println("The value of I: "+ i);
                //System.out.println("The value of J: " + j+ "\n");
                letters[s.charAt(j)-97]++;
                if(letters[s.charAt(j)-97]> 2){
                    ans= Math.max(ans, j-i);
                    break;
                }
                ans= Math.max(ans, j-i+1);
            }
        //System.out.println(Arrays.toString(letters));
            for(int k=0; k<letters.length; k++){
                letters[k]= 0;
            }
        }

        return ans;
        
    }
}