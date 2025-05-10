package Actividad03;

import Actividad03.PriorityQueue;
import Actividad03.PriorityQueueLinkSort;
import actividad1.ExceptionIsEmpty;

public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String, Integer> cola = new PriorityQueueLinkSort<>();

        cola.enqueue("Tarea A", 2);
        cola.enqueue("Tarea B", 5);
        cola.enqueue("Tarea C", 3);
        cola.enqueue("Tarea D", 5);
        cola.enqueue("Tarea E", 1);

        System.out.println("Contenido de la cola de prioridad:");
        System.out.println(cola);
    }

}
