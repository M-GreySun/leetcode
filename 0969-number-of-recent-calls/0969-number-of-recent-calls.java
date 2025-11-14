class RecentCounter {

    ArrayList <Integer> list;

    public RecentCounter() {
        list= new ArrayList ();
    }
    
    public int ping(int t) {
        int counter=0;
        list.add(t);
        for(int i=0; i< list.size(); i++){
            if((t-3000)<=list.get(i) && list.get(i)<=t){
                counter++;
            }
        }
        return counter;

    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */