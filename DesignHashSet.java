class MyHashSet {
	private boolean [] hset;
    public MyHashSet() {
        hset=new boolean[1000001];
        Arrays.fill(hset,false);
    }
    
    public void add(int key) {
        hset[key]=true;
    }
    
    public void remove(int key) {
        hset[key]=false;
    }
    
    public boolean contains(int key) {
        return hset[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
