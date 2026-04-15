import java.util.Scanner;

public class clase7ej2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];

        // Pedir notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // Calcular promedio
        double suma = 0;
        double mayor = notas[0];
        double menor = notas[0];

        for (double nota : notas) {
            suma += nota;

            if (nota > mayor) {
                mayor = nota;
            }

            if (nota < menor) {
                menor = nota;
            }
        }

        double promedio = suma / notas.length;

        System.out.println("\nPromedio: " + promedio);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}
