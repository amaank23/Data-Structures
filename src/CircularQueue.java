public class CircularQueue implements Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;

    public CircularQueue(int size){
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public void enqueue(int value) {
        if(isFull()){
            System.out.println("Queue is Full can not enter more elements");
        } else {
            if(isEmpty()){
                front = 0;
            }

            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
        }
    }

    public void dequeue() {
        if(isEmpty()){
            System.out.println("Queue is Empty, cannot dequeue");
        } else {
            if(front == rear){
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % maxSize;
            }
        }
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public void display() {

    }
}
