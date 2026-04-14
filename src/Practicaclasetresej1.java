public class Practicaclasetresej1 {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio: Multiplicar divisibles por 3 (1 al 20) ---");
        long resultadoMultiplicacion = 1;
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                resultadoMultiplicacion *= i;
                System.out.println("Multiplicando por: " + i);
            }
        }
        System.out.println("Resultado final: " + resultadoMultiplicacion);

        System.out.println("\n--- Ejercicio: Conteo de letras y vocales ---");
        String nombre = "Rocío"; // Puedes cambiarlo por el tuyo
        int totalLetras = nombre.length();
        int totalVocales = 0;
        String nombreMin = nombre.toLowerCase();

        for (int i = 0; i < nombreMin.length(); i++) {
            char letra = nombreMin.charAt(i);
            // Verificamos vocales incluyendo la 'í' con tilde
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'í') {
                totalVocales++;
            }
        }

        System.out.println("El nombre '" + nombre + "' tiene " + totalLetras + " letras.");
        System.out.println("Tiene un total de " + totalVocales + " vocales.");
    }
}

