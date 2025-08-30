class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        for (int fruit=0; fruit< fruits.length; fruit++){
            for(int basket=0; basket<baskets.length; basket++){
                if(fruits[fruit]<=baskets[basket]){
                    baskets[basket]=-1;
                    count++;
                    break;
                }
            }
        }
        return fruits.length-count;
    }
}