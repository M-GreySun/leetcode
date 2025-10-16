class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase().replaceAll("[!?',;.]", " ");

        HashMap <String, Integer> wordCount= new HashMap <String, Integer> ();
        int max=0;
        String ans="";

        for(String ele: paragraph.split(" ")){
            if(!String.join(" ", banned).contains(ele)){
                if(wordCount.containsKey(ele)){
                    wordCount.put(ele, wordCount.get(ele)+1);
                }
                else{
                    wordCount.put(ele, 1);
                }
                if(max<wordCount.get(ele)){
                    ans=ele;
                    max=wordCount.get(ele);
                }
            }
        }
        return ans;
    }
}