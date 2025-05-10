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

        this.first = 0;
        this.last = 0;
        this.size = 0;
    }

    public void enqueue(E x) {
        if (isFull()) {
            System.out.println("La cola está llena");
            return;
        }
        array[last] = x;
        last = (last + 1) % max;
        size++;
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cola vacía");

        E x = array[first];
        first = (first + 1) % max;
        size--;
        return x;
    }

    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cola vacía");
        return array[first];
    }




}
