import java.util.Arrays;

public class clase7ej1 {
    public static void main(String[] args) {

        // 1. Crear array
        String[] peliculas = {"Matrix", "Avatar", "Lion King", "Batman"};

        // Ordenar alfabéticamente
        Arrays.sort(peliculas);

        // Imprimir con for-each
        System.out.println("Películas ordenadas:");
        for (String peli : peliculas) {
            System.out.println(peli);
        }

        // 2. Nuevo array en mayúsculas
        String[] peliculasMayus = new String[peliculas.length];

        for (int i = 0; i < peliculas.length; i++) {
            peliculasMayus[i] = peliculas[i].toUpperCase();
        }

        System.out.println("\nPelículas en mayúsculas:");
        for (String peli : peliculasMayus) {
            System.out.println(peli);
        }

        // 3. Copia con 2 títulos más
        String[] nuevasPeliculas = Arrays.copyOf(peliculas, peliculas.length + 2);
        nuevasPeliculas[nuevasPeliculas.length - 2] = "Inception";
        nuevasPeliculas[nuevasPeliculas.length - 1] = "Titanic";

        System.out.println("\nNuevo array con más películas:");
        System.out.println(Arrays.toString(nuevasPeliculas));

        // 4. Buscar primera película que empiece con "L"
        String peliConL = null;

        for (String peli : peliculas) {
            if (peli.startsWith("L")) {
                peliConL = peli;
                break;
            }
        }

        System.out.println("\nPrimera película que empieza con L:");
        if (peliConL != null) {
            System.out.println(peliConL);
        } else {
            System.out.println("No se encontró ninguna");
        }
    }
}