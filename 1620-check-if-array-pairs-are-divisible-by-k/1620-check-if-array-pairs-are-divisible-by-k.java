class Solution {
    public boolean canArrange(int[] arr, int k) {
        int [] values= new int [k];
        for(int ele: arr){
            values[((ele % k) + k) % k]++;
        }
        for(int i=1; i<k; i++){
            if(values[i]!=values[k-i]){
                return false;
            }
        } 
        return values[0]%2==1? false: true;
    }
}