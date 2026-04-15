public class Clase11 {

    public static void main(String[] args) {

        // Crear libro11
        Libro11 libro11 = new Libro11("123456", "Java", "Autor", 35, 1000, 'C');

        System.out.println("Codigo: " + libro11.getCodigo());
        System.out.println("Ultimos 3 digitos: " + libro11.getUltimos3Digitos());
        System.out.println("Precio final: " + libro11.getPrecioVenta());
        System.out.println("Ganancia: " + libro11.calcularGanancia());

        // Probar cambios
        libro11.setStock(10);
        libro11.actualizarPrecioVenta(1500);

        System.out.println("Nuevo precio: " + libro11.getPrecioVenta());

        // Array de libros
        Libro11[] biblioteca = new Libro11[2];

        biblioteca[0] = libro11;
        biblioteca[1] = crearLibroDesdeTexto("789123,Python,Autor2,20,800,C");

        // Mostrar array
        for (Libro11 l : biblioteca) {
            System.out.println("\nLibro11:");
            System.out.println(l.getCodigo() + " - " + l.getTitulo());
        }
    }

    // Función pedida (crear libro desde texto)
    public static Libro11 crearLibroDesdeTexto(String datos) {

        String[] partes = datos.split(",");

        String codigo = partes[0];
        String titulo = partes[1];
        String autor = partes[2];
        int stock = Integer.parseInt(partes[3]);
        double costo = Double.parseDouble(partes[4]);
        char sector = partes[5].charAt(0);

        return new Libro11(codigo, titulo, autor, stock, costo, sector);
    }
}

// Clase Libro11
class Libro11 {

    private final String codigo; // INMUTABLE
    private String titulo;
    private String autor;
    private int stock;
    private double precioCosto;
    private double precioVenta;
    private char sector;

    public Libro11(String codigo, String titulo, String autor, int stock, double precioCosto, char sector) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
        this.precioCosto = precioCosto;
        this.sector = sector;
        this.precioVenta = precioCosto * 1.25;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getUltimos3Digitos() {
        if (codigo.length() >= 3) {
            return codigo.substring(codigo.length() - 3);
        }
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecioVenta() {
        return aplicarDescuentos();
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public void actualizarPrecioVenta(double nuevoPrecio) {
        if (nuevoPrecio >= precioCosto) {
            this.precioVenta = nuevoPrecio;
        }
    }

    public boolean hayStock() {
        return stock > 0;
    }

    public double calcularGanancia() {
        return getPrecioVenta() - precioCosto;
    }

    // TODAS LAS REGLAS DE DESCUENTO
    private double aplicarDescuentos() {

        double precioFinal = precioVenta;

        // Descuento sector C
        if (sector == 'c' || sector == 'C') {
            precioFinal *= 0.90;
        }

        // Descuento por stock > 30
        if (stock > 30) {
            double precioConDescuento = precioFinal * 0.90;

            // Validar que no haya pérdida
            if (precioConDescuento >= precioCosto) {
                precioFinal = precioConDescuento;
            }
        }

        return precioFinal;
    }
}
