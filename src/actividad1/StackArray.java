package actividad1;

import actividad1.Stack;
import actividad1.StackArray;
import actividad1.ExceptionIsEmpty;


public class StackArray<E>  implements Stack<E> {
    private E[] array;
    private int tope;

    public StackArray(int n) {
        this.array = (E[]) new Object[n];
        this.tope = -1;
    }

    public void push(E x) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        array[++tope] = x;

    }

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Stack is empty");
            return array[tope--];
    
    }

    public E top() throws ExceptionIsEmpty {
    if (isEmpty()) throw new ExceptionIsEmpty("Stack is empty");
        return array[tope];
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public boolean isFull() {
        return tope == array.length - 1;
    }

    public String toString() {
        String result = "";
        for (int i = tope; i >= 0; i--) {
            result += array[i] + "\n";
        }
        return result;
    }
    
}


