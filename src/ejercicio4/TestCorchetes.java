package ejercicio4;

public class TestCorchetes {
    public static void main(String[] args) {
        String[] pruebas = {
            "()()()[()]()",
            "((()))[]",
            "([])[](",
            "([{)]}",
            "[",
            "[][][]{{{}}}"
        };
    

        for (String cadena : pruebas) {
            boolean resultado = Aplication.symbolBalancing(cadena);
            System.out.println("Cadena: " + cadena + " → ¿Balanceada? " + resultado);
        }
    }

}
