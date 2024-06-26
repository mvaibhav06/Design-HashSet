class MyHashSet {

    List<Integer> temp;

    public MyHashSet() {
        temp = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!temp.contains(key)){
            temp.add(key);
        }
    }
    
    public void remove(int key) {
        int id = temp.indexOf(key);

        if(id != -1){
            temp.remove(id);
        }
    }
    
    public boolean contains(int key) {
        return temp.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
