package MODULO2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PC
 */
public class Recursos4 {
    // Primer método: Retorna un mensaje de Programación Orientada a Objetos
    public String obtenerMensaje() {
        return "Programacion Orientada a Objetos";
    }

    // Segundo método: Retorna un mensaje dependiendo de la edad
    public String verificarEdad(int edad) {
        if (edad >= 18) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public List<Integer> generarLista(int x) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            lista.add(i);
        }
        return lista;
    }

    public static void main(String[] args) {
       
        Recursos4 recursos = new Recursos4();
        
        System.out.println(recursos.obtenerMensaje());

        int edad = 20;
        System.out.println("Edad: " + edad + " - " + recursos.verificarEdad(edad));
        
        edad = 15;
        System.out.println("Edad: " + edad + " - " + recursos.verificarEdad(edad));
        
     
        int a = 5;
        int b = 4;
        System.out.println("Multiplicación de " + a + " y " + b + ": " + recursos.multiplicar(a, b));
        
        int x = 15;
        System.out.println("Lista del 1 al " + x + ": " + recursos.generarLista(x));
    }
}
