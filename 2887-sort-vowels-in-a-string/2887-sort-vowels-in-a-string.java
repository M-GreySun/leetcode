class Solution {
    public String sortVowels(String s) {

        ArrayList <Character> values= new ArrayList <> ();

        Set <Character> vowels= new HashSet <Character> ();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        for(int i=0; i< s.length(); i++){
            if(vowels.contains(s.charAt(i))){
                values.add(s.charAt(i));
            }
        }

        values.sort((a,b)->{
            return a-b;
        });
        
        StringBuilder ans= new StringBuilder (s);
        for(int i=0; i< ans.length(); i++){
            if(vowels.contains(ans.charAt(i))){
                ans.setCharAt(i, values.get(0));
                values.remove(0);
            }
        }
        return ans.toString();        
    }
}