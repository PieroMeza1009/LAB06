package Ejercicio01;

import actividad1.Stack;
import actividad1.ExceptionIsEmpty;

//implementa la interfaz Stack, usando una lista enlazada
public class StackLink<E> implements Stack<E> {
    private Node<E> top; //nodo que representa el tope (el último elemento ingresado) de la pila
    // al inicio, la pila está vacía (top es null)
    public StackLink() {
        this.top = null;
    }

    //// metodo para agregar un elemento a la pila (push)
    public void push(E x) {
        Node<E> nuevo = new Node<>(x); ///// Se crea un nuevo nodo con el valor x
        nuevo.setNext(top);
        top = nuevo; //ahora el tope va a ser el nuevo nodo
    }

    //este es un metodo para eliminar y devolver el elemento del tope (pop)
    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Stack is empty");
        E valor = top.getData();
        top = top.getNext(); //// El nuevo tope pasa a ser el siguiente nodo
        return valor;
    }

    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Stack is empty");
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String toString() {
        String resultado = "";
        Node<E> aux = top;
        while (aux != null) {
            resultado += aux.getData() + "\n";
            aux = aux.getNext();
        }
        return resultado;
    }
}
