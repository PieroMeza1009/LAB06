package actividad1;


public class StackArray  implements Stack<E> {
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
    
    
}


