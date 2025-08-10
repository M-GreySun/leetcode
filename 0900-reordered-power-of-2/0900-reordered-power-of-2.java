class Solution {
    public boolean reorderedPowerOf2(int n) {

        char [] test= String.valueOf(n).toCharArray();
        Arrays.sort(test);
        //System.out.println("The value of test: "+ Arrays.toString(test));

        for(int i=0; i< 30; i++){
            char [] power= String.valueOf((int)Math.pow(2,i)).toCharArray();
            Arrays.sort(power);
            //System.out.println("The value of power: " + Arrays.toString(power));
            if(Arrays.equals(power, test)){
                return true;
            }
        }
        return false;        
    }
}