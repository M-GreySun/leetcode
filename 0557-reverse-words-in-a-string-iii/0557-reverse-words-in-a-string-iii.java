class Solution {
    public String reverseWords(String s) {
        String [] words= s.split(" ");
        for(int i=0; i<words.length; i++){
            StringBuilder temp= new StringBuilder(words[i]).reverse();
            words[i]=temp.toString();
        }
        return String.join(" ", words); 
    }
}