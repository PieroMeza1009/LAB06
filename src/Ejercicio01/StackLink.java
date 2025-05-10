package Ejercicio01;

import actividad1.Stack;
import actividad1.ExceptionIsEmpty;

public class StackLink<E> implements Stack<E> {
    private Node<E> top;
    public StackLink() {
        this.top = null;
    }

    public void push(E x) {
        Node<E> nuevo = new Node<>(x);
        nuevo.setNext(top);
        top = nuevo;
    }

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Stack is empty");
        E valor = top.getData();
        top = top.getNext();
        return valor;
    }

    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Stack is empty");
        return top.getData();
    }
}
