public interface Queue {
    public void enqueue(int value);
    public void dequeue();
    public boolean isEmpty();
    public boolean isFull();
    public void display();
}
