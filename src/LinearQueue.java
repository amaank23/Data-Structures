public class LinearQueue implements Queue {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public LinearQueue(int s){
        maxSize = s;
        queArray = new int[maxSize];
        front = -1;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is Full, can not enter more items");
        } else {
            if(isEmpty()){
                front = 0;
            }
            rear++;
            queArray[rear] = value;
            nItems++;
        }

    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Can not dequeue, because queue is empty");
        } else {
            if(nItems == 1){
                front = -1;
                rear = -1;
                nItems = 0;
            } else {
                front++;
                nItems--;
            }

        }

    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return rear == maxSize - 1;
    }

    public void display(){
        if(nItems == 0){
            System.out.println("Queue is Empty, can not display");
        } else {
            for(int i = front; i <= rear; i++){
                System.out.println(queArray[i]);
            }
        }

    }
    public void reverseTheFirstKElements(int k){
        for(int i = 0; i < k/2; i++){
            int temp = queArray[i];
            queArray[i] = queArray[k - 1 - i];
            queArray[k - 1 - i] = temp;
        }
    }
}
