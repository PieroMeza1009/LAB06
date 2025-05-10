package actividad1;

public class Test {
    public static void main(String[] args) {
        // Pila de enteros
        Stack<Integer> pilaEnteros = new StackArray<>(5);
        pilaEnteros.push(10);
        pilaEnteros.push(20);
        pilaEnteros.push(30);
        System.out.println("Pila de enteros:");
        System.out.println(pilaEnteros);

        try {
            System.out.println("Tope: " + pilaEnteros.top());
            System.out.println("Desapilado: " + pilaEnteros.pop());
            System.out.println("Nuevo tope: " + pilaEnteros.top());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }

}
