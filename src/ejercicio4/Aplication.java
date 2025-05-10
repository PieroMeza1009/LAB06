package ejercicio4;

import Ejercicio01.StackLink;
import actividad1.Stack;
import actividad1.ExceptionIsEmpty;


public class Aplication {
    public static boolean symbolBalancing(String s) {
        Stack<Character> pila = new StackLink<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) return false;
                try {
                    char top = pila.pop();
                    if (!esPar(top, c)) return false;
                } catch (ExceptionIsEmpty e) {
                    return false;
                }
            }
        }

        return pila.isEmpty(); // debe estar vacía si todo fue cerrado correctamente
    }



}
