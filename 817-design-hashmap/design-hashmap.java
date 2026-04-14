class MyHashMap {
    int[] aman;
    public MyHashMap() {
        aman=new int[1_000_001];
        Arrays.fill(aman,-1);
    }
    
    public void put(int key, int val) {
        aman[key]=val;
    }
    
    public int get(int key) {
        return aman[key];
    }
    
    public void remove(int key) {
        aman[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */