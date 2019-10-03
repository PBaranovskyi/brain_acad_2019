package mainclasses.linkedList;

public class LinkedListMy<T> {


    int size;

    Node<T> rootNode = new Node<>(null);
    Node<T> lastNode = rootNode;

    public void delete(int indx) {
        Node cursor = rootNode;

        int inxCounter = 0;
        while (inxCounter != indx) {
            inxCounter++;
            cursor = cursor.getNext();
        }

        cursor.getNext().setPrev(cursor.getPrev());
        cursor.getPrev().setNext(cursor.getNext());

        size--;
    }

    public void add(T value) {

        size++;
        Node<T> newNode = new Node<>(value);
        newNode.setPrev(lastNode);
        lastNode.setNext(newNode);
        lastNode = newNode;

    }

    @Override
    public String toString() {
        Node cursor = rootNode;

       StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            cursor = cursor.getNext();

            result.append(cursor.getValue());
            result.append("||||||");
        }
        return result.toString();
    }
}
