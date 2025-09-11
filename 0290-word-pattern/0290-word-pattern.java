class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] array= s.split(" ");

        if(pattern.length()!=array.length){
            return false;
        }
        
        HashMap <Character, String> charWord= new HashMap <Character, String> ();
        HashSet <String> dup= new HashSet <String> ();

        for(int i=0; i< pattern.length(); i++){
            if(!charWord.containsKey(pattern.charAt(i))){
                charWord.put(pattern.charAt(i), array[i]);
                if(dup.contains(array[i])){
                    return false;
                }
                dup.add(array[i]);
            }
            else{
                if(!charWord.get(pattern.charAt(i)).equals(array[i])){
                    return false;
                }
            }
        }


        return true;

    }
}