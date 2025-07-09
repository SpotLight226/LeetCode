class RandomizedSet {
    List<Integer> list;
    Map<Integer, Integer> map;
    Random ran;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        ran = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }

        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }

        int idx = map.get(val);
        int last = list.get(list.size() - 1);

        list.set(idx, last);
        map.put(last, idx);

        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return list.get(ran.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */