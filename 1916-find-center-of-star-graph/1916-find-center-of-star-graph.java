class Solution {
    public int findCenter(int[][] edges) {
        int [] edgeFrequency = new int [edges.length +1];

        for(int []ele: edges){

            edgeFrequency[ele[0]-1]++;
            edgeFrequency[ele[1]-1]++;
            if(edgeFrequency[ele[0]-1]==edges.length){
                return ele[0];
            }
            if(edgeFrequency[ele[1]-1]==edges.length){
                return ele[1];
            }
        }        

        return -1;
    }
}