class RandomizedSet {
    HashMap<Integer, Integer> valuesMap;
    ArrayList<Integer> valuesArray;
    Random random;

    public RandomizedSet() {
        valuesMap = new HashMap<Integer, Integer>();
        valuesArray = new ArrayList<Integer>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(valuesMap.containsKey(val)){
            return false;
        }
        valuesArray.add(val);
        valuesMap.put(val, valuesArray.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!valuesMap.containsKey(val)){
            return false;
        }
        int pos = valuesMap.get(val);
        if( pos != valuesArray.size()-1){
            int lastElement = valuesArray.get(valuesArray.size()-1);
            valuesArray.set(pos, lastElement);
            valuesMap.put( lastElement, pos );
        }
        valuesMap.remove(val);
        valuesArray.remove(valuesArray.size() - 1);
        return true;
    }
    
    public int getRandom() {
        return valuesArray.get(random.nextInt(valuesArray.size()));
    }
}
