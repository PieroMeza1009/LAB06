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
    

        System.out.println("Contenido de la pila:");
        System.out.println(pila);

        try {
            System.out.println("Tope: " + pila.top());
            System.out.println("Desapilado: " + pila.pop());
            System.out.println("Nuevo tope: " + pila.top());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }

}
