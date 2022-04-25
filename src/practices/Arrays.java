package practices;

public class Arrays {
    public static void main(String[] args) {
        int[] object1 = {2, 4, 6, 8, 9};
        System.out.println(java.util.Arrays.toString(object1));
        deleteElementInAnArray(object1, 6);
        System.out.println(java.util.Arrays.toString(object1));

    }
//    Traverse − Print all the elements in the array one by one.
//    Insertion − Adds an element at the given index.
//            Deletion − Deletes an element at the given index.
//            Search − Searches an element in the array using the given index or the value.
//            Update − Updates an element at the given index.


    //insertion

    public int insertElementIntoAnArray(int[] object1, int element, int targetIndex) {
        object1[targetIndex] = element;
        return element;
    }

    public static void deleteElementInAnArray(int[] object1, int element) {
        for (int i = 0; i <= object1.length - 1; i++) {
            if (element == object1[i])
                object1[i] = 0;

            else {
                System.out.println(element + " is not in index " + i);
            }
            //how delete random elements
            // why is the @ sign showing
        }
    }

    public void searchElementInArray(int [] object1, int element){
        java.util.Arrays.sort(object1);
       int middleElement = object1.length / 2;
      if (element >= middleElement ){
          for (int i = middleElement; i < object1.length; i++){

          }
       }
    }
}
