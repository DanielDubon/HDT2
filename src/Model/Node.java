package Model;

public class Node <T>{

    public T value;
    public Node<T> next;

    public Node(T value) {
        this.setValue(value);
    }
    /**
     * @return the value
     */
    public T getValue() {
        return value;
    }
    /**
     * @param value the value to set
     */
    public void setValue(T value) {
        this.value = value;
    }
    /**
     * @return the next
     */
    public Node<T> getNext() {
        return next;
    }
    /**
     * @param next the next to set
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
