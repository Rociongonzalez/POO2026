import java.util.Scanner;

public class clase8practica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // EJERCICIO 1
        int encuentros = 23;
        double porcentaje = 0.75;

        int faltas = calcularFaltasDisponibles(encuentros, porcentaje);
        System.out.println("Faltas permitidas (23 encuentros, 75% asistencia): " + faltas);

        // Si querés probar otro caso (ej: tu módulo), cambiás valores:
        System.out.print("\nIngrese cantidad de encuentros: ");
        int encuentrosUsuario = sc.nextInt();

        System.out.print("Ingrese porcentaje de asistencia (ej: 0.75): ");
        double porcentajeUsuario = sc.nextDouble();

        int faltasUsuario = calcularFaltasDisponibles(encuentrosUsuario, porcentajeUsuario);
        System.out.println("Faltas permitidas: " + faltasUsuario);

        sc.nextLine(); // limpiar buffer

        // EJERCICIO 2
        String resultado = ingresarDestinos(sc);
        System.out.println("\nDestinos ingresados: " + resultado);

        sc.close();
    }

    // 1. Función faltas disponibles
    public static int calcularFaltasDisponibles(int encuentros, double porcentajeAsistencia) {

        int asistenciaMinima = (int) Math.ceil(encuentros * porcentajeAsistencia);
        int faltasPermitidas = encuentros - asistenciaMinima;

        return faltasPermitidas;
    }

    // 2. Función para ingresar destinos
    public static String ingresarDestinos(Scanner sc) {

        String[] destinos = new String[5];
        int contador = 0;

        while (contador < 5) {
            System.out.print("Ingrese destino " + (contador + 1) + ": ");
            String destino = sc.nextLine();

            // Validación: no vacío
            if (destino == null || destino.trim().isEmpty()) {
                System.out.println("Entrada inválida. Intente nuevamente.");
            } else {
                destinos[contador] = destino;
                contador++;
            }
        }

        // Convertir array a texto
        String resultado = "";

        for (int i = 0; i < destinos.length; i++) {
            resultado += destinos[i];

            if (i < destinos.length - 1) {
                resultado += ", ";
            }
        }

        return resultado;
    }
}