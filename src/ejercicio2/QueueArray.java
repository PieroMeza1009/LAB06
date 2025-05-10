package ejercicio2;

import Actividad2.Queue;
import actividad1.ExceptionIsEmpty;

public class QueueArray<E> implements Queue<E> {
    private E[] array;
    private int first; 
    private int last;
    private int size;
    private int max;

    public QueueArray(int capacidad) {
        this.array = (E[]) new Object[capacidad];
        this.max = capacidad;

    }


}
