package collections;

/**
 * Created by DioAn1730700 on 2018-03-15.
 */
public class Node <T>{

    private Node next;
    private T value;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


}
