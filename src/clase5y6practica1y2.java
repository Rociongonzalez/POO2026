import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class clase5y6practica1y2 {

    public static void main(String[] args) {

        // 1. Integer divisibles por 2 y 7
        Integer num1 = 14;
        Integer num2 = 28;

        if (esDivisible(num1) && esDivisible(num2)) {
            String resultado = "" + num1 + num2;
            System.out.println("Concatenación: " + resultado);
        } else {
            System.out.println("Alguno no es divisible por 2 y 7");
        }

        // 2. Fecha de nacimiento y edad
        LocalDate nacimiento = LocalDate.of(1991, 12, 20);
        calcularEdad(nacimiento);

        Scanner sc = new Scanner(System.in);

        // 3. Scanner + función comparación
        System.out.print("\nIngrese un número: ");
        int numero = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();

        compararNumeroConTexto(numero, texto);

        // 4. Scanner + función letra y longitud
        System.out.print("\nIngrese una palabra: ");
        String palabra = sc.nextLine();

        System.out.print("Ingrese una posición: ");
        int posicion = sc.nextInt();

        obtenerLetraYLongitud(palabra, posicion);

        // 5. Fecha de vencimiento
        LocalDate vencimiento = LocalDate.of(2026, 12, 31);
        calcularDiasRestantes(vencimiento);

        sc.close();
    }

    // 1. Método divisibilidad
    public static boolean esDivisible(Integer num) {
        return (num % 2 == 0) && (num % 7 == 0);
    }

    // 2. Calcular edad y formatear fecha
    public static void calcularEdad(LocalDate nacimiento) {
        LocalDate hoy = LocalDate.now();
        Period edad = Period.between(nacimiento, hoy);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yy MM dd");

        System.out.println("\nFecha formateada: " + nacimiento.format(formato));
        System.out.println("Edad: " + edad.getYears() + " años");
    }

    // 3. Comparar int convertido a String
    public static void compararNumeroConTexto(int num, String texto) {
        String numStr = String.valueOf(num);

        if (numStr.equals(texto)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }

    // 4. Obtener letra y longitud
    public static void obtenerLetraYLongitud(String texto, int posicion) {

        if (posicion >= 0 && posicion < texto.length()) {
            char letra = texto.charAt(posicion);

            System.out.println("Letra: " + letra);
            System.out.println("Longitud: " + texto.length());
        } else {
            System.out.println("Posición inválida");
        }
    }

    // 5. Calcular días restantes
    public static void calcularDiasRestantes(LocalDate vencimiento) {
        LocalDate hoy = LocalDate.now();

        long dias = ChronoUnit.DAYS.between(hoy, vencimiento);

        System.out.println("\nDías restantes al vencimiento: " + dias);
    }
}