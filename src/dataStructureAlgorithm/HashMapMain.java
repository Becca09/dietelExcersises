package dataStructureAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class HashMapMain {
private int elementCounter;
private ArrayList <String> keys = new ArrayList<>();
private ArrayList <String> values = new ArrayList<>();


    public int size() {
        return elementCounter;
    }

    public void put(String key, String value) {
        if(!keys.contains(key)){
        keys.add(key);
        values.add(value);
        elementCounter++;}
        else{
          replace(key, value);

        }
    }

    public String findBy(String key) {
        int indexOfKey = findIndexOf(key);
        return values.get(indexOfKey);
    }

    private int findIndexOf(String key) {
        int indexOfKey = 0;
        for (int i = 0; i < size(); i++) {
            if(keys.get(i).equals(key)){indexOfKey = i; break;}
        }
        return indexOfKey;
    }
    public void replace(String key, String value){
         int valueIndex = findIndexOf(key);
         values.set(valueIndex, value);
    }
}
