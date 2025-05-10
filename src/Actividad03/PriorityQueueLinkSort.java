package Actividad03;
import actividad1.ExceptionIsEmpty;

public class PriorityQueueLinkSort<E, N extends Comparable<N>> implements PriorityQueue<E, N> {

    class EntryNode {
        E data;
        N priority;
        EntryNode(E data, N priority) {
            this.data = data;
            this.priority = priority;
        }
        public String toString() {
            return data + " (" + priority + ")";
        }
    
    }
    private Node<EntryNode> first;
    private Node<EntryNode> last;

    public PriorityQueueLinkSort() {
        this.first = null;
        this.last = null;
    }

    public void enqueue(E x, N pr) {
        EntryNode nuevo = new EntryNode(x, pr);
        Node<EntryNode> nuevoNodo = new Node<>(nuevo);
        if (isEmpty()) {
            first = last = nuevoNodo;

}
