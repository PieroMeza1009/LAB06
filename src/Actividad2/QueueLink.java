package Actividad2;

public class QueueLink<E> implements Queue<E> {
    private Node<E> first;
    private Node<E> last;

    public QueueLink() {
        this.first = null;
        this.last = null;
    }
    public void enqueue(E x) {
        Node<E> aux = new Node<>(x);
    }

}
