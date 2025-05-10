package ejercicio2;

import ejercicio2.QueueArray;
import Actividad2.Queue;
import actividad1.ExceptionIsEmpty;

public class TestQueueArray {
        Queue<String> cola = new QueueArray<>(5);

        cola.enqueue("Uno");
        cola.enqueue("Dos");
        cola.enqueue("Tres");

        System.out.println("Contenido de la cola:");
        System.out.println(cola);

        try {
            System.out.println("Frente: " + cola.front());
            System.out.println("Último: " + cola.back());
            System.out.println("Desencolado: " + cola.dequeue());
            System.out.println("Nuevo frente: " + cola.front());



}
