package Ejercicio01;

import Ejercicio01.StackLink;
import actividad1.Stack;
import actividad1.ExceptionIsEmpty;


public class TestStackLink {
    public static void main(String[] args) {
        Stack<String> pila = new StackLink<>();

        pila.push("Uno");
        pila.push("Dos");
        pila.push("Tres");
    }

}
