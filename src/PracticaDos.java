import java.util.Scanner;

public class PracticaDos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // 1. Algoritmo del 18%
        System.out.print("Ingrese un número: ");
        double num = leer.nextDouble();
        if (num > 500) {
            double resultado = (num * 18) / 100;
            System.out.println("El 18% es: " + resultado);
        }

        // 2. Suma de los N primeros números
        System.out.print("Ingrese el límite N: ");
        int n = leer.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i; // Acumulamos el valor de i
        }
        System.out.println("La suma de los primeros " + n + " números es: " + suma);

        // 3. Pares e impares del 1 al 20
        System.out.println("Listado de pares e impares:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es PAR");
            } else {
                System.out.println(i + " es IMPAR");
            }
        }

        leer.close();
    }
}