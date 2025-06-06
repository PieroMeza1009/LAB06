package ejercicio3;

import Actividad03.PriorityQueue;
import Actividad2.QueueLink;
import Actividad2.Queue;
import actividad1.ExceptionIsEmpty;

public class PriorityQueueLinked <E> implements PriorityQueue<E, Integer> {

    private Queue<E>[] colas;
    private int prioridades;

    public PriorityQueueLinked(int prioridades) {
        this.prioridades = prioridades;
        this.colas = new Queue[prioridades];

        for (int i = 0; i < prioridades; i++) {
            colas[i] = new QueueLink<>();
        }
    }

    @Override
    public void enqueue(E x, Integer pr) {
        if (pr < 0 || pr >= prioridades) {
            System.out.println("Prioridad inválida: " + pr);
            return;
        }
        colas[pr].enqueue(x);
    }

    @Override
    public E dequeue() throws ExceptionIsEmpty {
        for (int i = prioridades - 1; i >= 0; i--) {

            if (!colas[i].isEmpty()) {
                return colas[i].dequeue();
            }
        }
        throw new ExceptionIsEmpty("Todas las colas están vacías");
    }

    @Override
    public E front() throws ExceptionIsEmpty {
        for (int i = prioridades - 1; i >= 0; i--) {
            if (!colas[i].isEmpty()) {
                return colas[i].front();
            }
        }
        throw new ExceptionIsEmpty("Todas las colas están vacías");
    }

    @Override
    public E back() throws ExceptionIsEmpty {
        for (int i = 0; i < prioridades; i++) {
            if (!colas[i].isEmpty()) {
                return colas[i].back();
            }
        }
        throw new ExceptionIsEmpty("Todas las colas están vacías");
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < prioridades; i++) {
            if (!colas[i].isEmpty()) {
                return false;
            }
        }
        return true;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = prioridades - 1; i >= 0; i--) {
            sb.append("Prioridad ").append(i).append(": ").append(colas[i]).append("\n");
        }
        return sb.toString();
    }

}
