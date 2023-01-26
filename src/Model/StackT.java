package Model;




public class StackT<T> implements IStack{

    private int size;
    private Node<T> top;

    public StackT(){
        top = null;
        size = 0;
    }

    @Override
    public int count() {
        return size;
    }

    @Override
    public boolean isEmpty() {
       return count()==0;
    }

    @Override
    public void push(Object value) {
        Node<T> newNode = new Node<T>((T) value);

        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }

        size++;
    }

    @Override
    public Object pull() {
        if (isEmpty()) {
            return null;
        } else {
            Node<T> temp = top;
            top = top.getNext();
            size--;

            return temp.getValue();
        }
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getValue();
        }
    }
}
