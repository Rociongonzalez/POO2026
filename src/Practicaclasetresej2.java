import java.util.Scanner;

public class Practicaclasetresej2  {
    public static void main(String[] args) {
        // 1. Comparar cadenas
        String frase1 = "Programación en Java";
        String frase2 = "programación en java";

        System.out.println("--- Comparación de Cadenas ---");
        if (frase1.equals(frase2)) {
            System.out.println("Las frases son exactamente iguales.");
        } else {
            System.out.println("Las frases son distintas (Java distingue mayúsculas/minúsculas).");
        }

        // 2. Cantidad de caracteres
        System.out.println("\n--- Longitud de Frase ---");
        System.out.println("La primera frase tiene " + frase1.length() + " caracteres.");

        // 3. Uso de la función de iniciales
        System.out.println("\n--- Iniciales Mayúsculas ---");
        // Aca llama a la función que creamos abajo
        String iniciales = obtenerIniciales("Rocío", "González");
        System.out.println("Las iniciales son: " + iniciales);
    }

    // FUNCIÓN
    // tiene estar fuera del main, pero dentro de la clase EjerciciosString
    public static String obtenerIniciales(String nom, String ape) {
        char iniNom = nom.toUpperCase().charAt(0);
        char iniApe = ape.toUpperCase().charAt(0);
        return iniNom + "." + iniApe + ".";
    }
}