public class PracticaUno {
    public static void main(String[] args) {
        // 1. Variables y visualización
        String nombre = "Juan";
        String apellido = "Pérez";
        int edad = 30;
        double peso = 75.5;
        double altura = 1.75;

        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Peso: " + peso);

        // 2. Nombre completo
        System.out.println("Nombre completo: " + nombre + " " + apellido);

        // 3. Calcular IMC (peso / altura^2)
        double imc = peso / (altura * altura);
        // Visualizar como entero usando (int) para truncar decimales
        System.out.println("IMC (como entero): " + (int)imc);

        // 4. If: Edad par y múltiplo de 3
        if (edad % 2 == 0 && edad % 3 == 0) {
            System.out.println("La edad es par y múltiplo de 3.");
        }

        // 5. Retornar piso según sector (usando switch es más limpio)
        char sector = 'b';
        switch (sector) {
            case 'a': System.out.println("Piso 2°"); break;
            case 'b': System.out.println("Piso 4°"); break;
            case 'c': System.out.println("Piso 10°"); break;
            default: System.out.println("Sector no válido");
        }
    }
}