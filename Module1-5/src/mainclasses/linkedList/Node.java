package mainclasses.linkedList;

public class Node <T> {


    T value;

    Node prev;
    Node next;

    public Node(T value) {
        this.value = value;
    }


    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

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
