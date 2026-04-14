public class clase4Ej2 {

    String nombre;

    // Constructor
    public clase4Ej2(String nombre) {
        this.nombre = nombre;
    }

    public void inicialYRepeticiones() {
        char inicial = Character.toLowerCase(nombre.charAt(0));
        int contador = 0;

        for (int i = 0; i < nombre.length(); i++) {
            if (Character.toLowerCase(nombre.charAt(i)) == inicial) {
                contador++;
            }
        }

        System.out.println("Inicial: " + inicial);
        System.out.println("Se repite: " + contador + " veces");
    }
    public static void main(String[] args) {
        clase4Ej2 nombre1 = new clase4Ej2("Mariana");
        nombre1.inicialYRepeticiones();
    }
}


