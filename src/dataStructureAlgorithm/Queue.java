package dataStructureAlgorithm;

public class Queue {

private int popCounter;
private int[] elements;

private  int numberOfElements;

    public Queue(){
        elements = new int[10];
    }
    public boolean isEmpty() {
        if(numberOfElements == 0){
            return true;
        }
        return false;
        
    }

//    push = enqueue
//    pop = dequeue

    public void enqueue(int numbers ) {
        if(numberOfElements == 10){
            throw new ArrayIndexOutOfBoundsException("Queue is full!");
        }
        else {
            elements[numberOfElements] = numbers;
            numberOfElements+=1;}
    }

    public int deque() {
        int poppedNumber = elements[popCounter];
        elements[popCounter] = 0;
        popCounter++;
        return poppedNumber;
    }
    public int peek() {
        return elements[numberOfElements];
    }
}
