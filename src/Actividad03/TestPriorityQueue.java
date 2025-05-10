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

        try {
            System.out.println("Elemento con mayor prioridad (front): " + cola.front());
            System.out.println("Elemento con menor prioridad (back): " + cola.back());

            System.out.println("Eliminando elemento de mayor prioridad: " + cola.dequeue());
            System.out.println("Nueva cola:");
            System.out.println(cola);
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }

}
