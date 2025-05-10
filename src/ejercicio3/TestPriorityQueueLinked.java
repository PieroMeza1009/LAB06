package ejercicio3;

import ejercicio3.PriorityQueueLinked;
import Actividad03.PriorityQueue;
import actividad1.ExceptionIsEmpty;

public class TestPriorityQueueLinked {
    public static void main(String[] args) {
        PriorityQueue<String, Integer> pq = new PriorityQueueLinked<>(5);
        pq.enqueue("Tarea urgente", 4);
        pq.enqueue("Tarea normal", 2);
        pq.enqueue("Tarea baja", 1);
        pq.enqueue("Tarea crítica", 4);
        pq.enqueue("Tarea sin apuro", 0);

        System.out.println("Contenido de la cola de prioridad:");
        System.out.println(pq);

        try {
            System.out.println("Elemento con mayor prioridad (front): " + pq.front());
            System.out.println("Elemento con menor prioridad (back): " + pq.back());
            System.out.println("Eliminando el de mayor prioridad: " + pq.dequeue());

            System.out.println("\nCola actual:");
            System.out.println(pq);
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }

}
