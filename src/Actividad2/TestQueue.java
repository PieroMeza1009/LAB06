package Actividad2;

import actividad1.ExceptionIsEmpty;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> cola = new QueueLink<>();

        cola.enqueue("A");
        cola.enqueue("B");
        cola.enqueue("C");

        System.out.println("Contenido de la cola:");
        System.out.println(cola);

        try {
            System.out.println("Frente: " + cola.front());
            System.out.println("Último: " + cola.back());
            System.out.println("Elemento desencolado: " + cola.dequeue());
            System.out.println("Nueva cola: " + cola);
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }

}
