public class Clase10 {

    public static void main(String[] args) {

        Libro libro = new Libro("001", "Java Basico", "Autor X", 10, 1000, 'C');

        System.out.println("Codigo: " + libro.getCodigo());
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Hay stock?: " + libro.hayStock());
        System.out.println("Precio de venta: " + libro.getPrecioVenta());
        System.out.println("Ganancia por unidad: " + libro.calcularGanancia());

        // Actualizar stock
        libro.setStock(5);
        System.out.println("Nuevo stock: " + libro.getStock());

        // Actualizar precio
        libro.actualizarPrecioVenta(1500);
        System.out.println("Nuevo precio de venta: " + libro.getPrecioVenta());
    }
}

// Clase Libro (no public)
class Libro {

    private String codigo;
    private String titulo;
    private String autor;
    private int stock;
    private double precioCosto;
    private double precioVenta;
    private char sector;

    // Constructor
    public Libro(String codigo, String titulo, String autor, int stock, double precioCosto, char sector) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
        this.precioCosto = precioCosto;
        this.sector = sector;

        // Precio por defecto (25% sobre costo)
        this.precioVenta = precioCosto * 1.25;
    }

    // Getters
    public String getCodigo() {
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
        return aplicarDescuento();
    }

    // Setter de stock (validación)
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock invalido");
        }
    }

    // Actualizar precio (nunca menor al costo)
    public void actualizarPrecioVenta(double nuevoPrecio) {
        if (nuevoPrecio >= precioCosto) {
            this.precioVenta = nuevoPrecio;
        } else {
            System.out.println("El precio de venta no puede ser menor al costo");
        }
    }

    // Disponibilidad
    public boolean hayStock() {
        return stock > 0;
    }

    // Ganancia por unidad
    public double calcularGanancia() {
        return getPrecioVenta() - precioCosto;
    }

    // Descuento sector C (10%)
    private double aplicarDescuento() {
        if (sector == 'c' || sector == 'C') {
            return precioVenta * 0.90;
        }
        return precioVenta;
    }
}