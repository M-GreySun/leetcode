class Solution {
    public int maxNumberOfBalloons(String text) {
        //How to spell balloon
        // one b, one a , one n
        // two l and two o
        int [] letters = new int [5];
        int ans=0;
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)== 'b'){
                letters[0]++;
            }
            else if(text.charAt(i)== 'a'){
                letters [1]++;
            }
            else if (text.charAt(i)== 'l'){
                letters[2]++;
            }
            else if (text.charAt(i)== 'o'){
                letters[3] ++;
            }
            else if (text.charAt(i)== 'n'){
                letters[4] ++;
            }

            if ( letters[2]>=2 && letters[3]>=2 && letters[0]>0 && letters[1]>0 && letters[4] >0){
                ans++;
                letters[0]--;
                letters[1]--;
                letters[2]-=2;
                letters[3]-=2;
                letters[4]--;
            }
        }
        return ans;
    }
}