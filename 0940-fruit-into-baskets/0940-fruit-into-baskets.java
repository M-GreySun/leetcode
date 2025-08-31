class Solution {
    public int totalFruit(int[] fruits) {
        int [] basketOne= new int [3];
        basketOne[0]=-1;
    
        int [] basketTwo =new int [3];
        basketTwo[0]=-1;
        int max=0;
    
        for(int i=0; i< fruits.length; i++){
            if(basketOne[0]==-1){
                basketOne[0]=fruits[i];
                basketOne[1]=1;
            }
            else if (basketTwo[0]==-1 && basketOne[0]!=-1 && basketOne[0]!=fruits[i]){
                basketTwo[0]=fruits[i];
                basketTwo[1]=1;
                basketOne[2]=basketOne[1];
            }
            else if(basketOne[0]==fruits[i]){
                basketOne[1]+=1;
                basketTwo[2]=basketTwo[1];
            }
            else if(basketTwo[0]==fruits[i]){
                basketTwo[1]+=1;
                basketOne[2]=basketOne[1];
            }
            else if(basketOne[0]!=fruits[i] && basketTwo[0]!=fruits[i]){
                max=Math.max(max, basketOne[1]+ basketTwo[1]);

                if(fruits[i-1]==basketOne[0]){
                    basketOne[1]-=basketOne[2];
                    basketOne[2]=basketOne[1];

                    basketTwo[0]=fruits[i];
                    basketTwo[1]=1;
                    basketTwo[2]=0;
                }
                else{
                    basketTwo[1]-=basketTwo[2];
                    basketTwo[2]=basketTwo[1];

                    basketOne[0]=fruits[i];
                    basketOne[1]=1;
                    basketOne[2]=0;
                }
            }
        }
        return Math.max(max, basketOne[1]+ basketTwo[1]);        
    }
}