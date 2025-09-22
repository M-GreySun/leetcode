class Solution {
    public int maxFreqSum(String s) {
        int [] freq= new int [26];
        String vowels= "aeiou";
        int maxVowel=0;
        int maxConst= 0;

        for(int i=0; i< s.length(); i++){
            char index= s.charAt(i);
            freq[index-97]++;
            if(vowels.contains(String.valueOf(index))){
                maxVowel= maxVowel< freq[index-97]? freq[index-97]: maxVowel;
            }
            else{
                maxConst= maxConst< freq[index-97]? freq[index-97]: maxConst;
            }
        }
        return maxVowel+ maxConst;
    }
}