package Actividad03;

import actividad1.ExceptionIsEmpty;

public interface PriorityQueue {
public interface PriorityQueue<E, N> {
    void enqueue(E x, N pr);

}
