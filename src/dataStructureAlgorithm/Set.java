package dataStructureAlgorithm;

import classWorks.ContentAlreadyExist;

import java.util.ArrayList;

public class Set {
    private ArrayList<Integer> element;

    public Set() {
        element = new ArrayList<>();
    }

    public boolean isEmpty() {
        return element.isEmpty();
    }

    public void add(int contents) {
        if (!element.contains(contents)) {
            element.add(contents);
        } else throw new ContentAlreadyExist("What you are trying to add already exists");
    }


    public int get(int index) {
        return element.get(index);
    }

    public int sizeOfSet() {
        return element.size();
    }

    public boolean contain(int content) {
        for (Integer integer : element) {
            if (content == integer) {
                return true;
            }
        }
        return false;
    }

    public void clearAll() {
        element.clear();
    }

    public void remove(Integer content) {
        for (int i = 0; i < element.size(); i++) {
            element.remove(content);
        }
    }
}
