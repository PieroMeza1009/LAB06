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
        } else if (pr.compareTo(first.getData().priority) > 0) {
            // Insertar al inicio
            nuevoNodo.setNext(first);
            first = nuevoNodo;
        } else {
            Node<EntryNode> actual = first;
            Node<EntryNode> anterior = null;


            while (actual != null && pr.compareTo(actual.getData().priority) <= 0) {
                anterior = actual;
                actual = actual.getNext();
            }

            nuevoNodo.setNext(actual);
            anterior.setNext(nuevoNodo);

            if (actual == null) {
                last = nuevoNodo;
            }
        }
    }
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Priority queue is empty");

        E dato = first.getData().data;
        first = first.getNext();

        if (first == null) last = null;

        return dato;
    }

    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Priority queue is empty");
        return first.getData().data;
    }

    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Priority queue is empty");
        return last.getData().data;
    }


}
