package dataStructureAlgorithm;

public class ImplementingAnArrayList {
    private int counter;
    private int length;
    private String[] shelf;

    public void add(String books) {
        if (counter == 0){
            length = 10;
            shelf = new String[length];
        }

        if (counter == length){
            increaseSizeOFShelf();
            shelf[counter] = books;
            counter++;
        }
        else {
            shelf[counter] = books;
            counter++;
        }

        }

    private void increaseSizeOFShelf() {
       length = length * 2;
        String[] shelf2 = new String[length];
        for (int i = 0; i < counter; i++) {
            shelf2[i] = shelf[i];
        }
        shelf = shelf2;
    }

    public int size() {
        return counter;
    }

    public String get(int index) {
        return shelf[index];
    }
    public void remove(String books) {
        for (int i = 0; i < length - 1; i++) {
            if (books.equals(shelf[i])) {
                implementBookRemoval(i);
            }
        }
    }
    public void remove(int index) {
        for (int i = 0; i < length - 1; i++) {
            if (i == index){
                implementBookRemoval(i);
            }

        }
    }
    public void add(int index, String book) {
        if (index < counter) {
            if (counter < length) {
                implementAdd(index, book);
                counter++;
            } else if (counter == length) {
                increaseSizeOFShelf();
                implementAdd(index, book);
                counter++;
            }
        }
    }
    public void implementAdd(int index, String item) {
        String[] shelf1 = new String[length];
        for (int i = 0; i < length; i++) {
            shelf1[i] = shelf[i];
        }
        shelf[index] = item;
        for (int i = index; i < length - 1; i++) {
            shelf[i + 1] = shelf1[i];
        }

    }


    private void implementBookRemoval(int i) {
        shelf[i] = null;
        counter--;
        for (int j = i; j < length - 1; j++) {
            shelf[j] = shelf[j + 1];
        }
    }
}

