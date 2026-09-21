class MyHashMap {
    int[] dash;
    public MyHashMap() {
        dash=new int[1_000_001];
        Arrays.fill(dash,-1);
    }
    
    public void put(int key, int value) {
        dash[key]=value;
    }
    
    public int get(int key) {
        return dash[key];
    }
    
    public void remove(int key) {
        dash[key]=-1;
    }
}
