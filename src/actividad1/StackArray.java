package actividad1;

public class StackArray  implements Stack<E> {
    private E[] array;
    private int tope;

        public StackArray(int n) {
        this.array = (E[]) new Object[n];
        this.tope = -1;
    }
}
