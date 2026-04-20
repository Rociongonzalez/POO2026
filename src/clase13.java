public class Libro {

    private final String codigo;
    private String titulo;
    private String autor;
       private int stock;
    private final double precioCosto;
    private double precioVenta;
    private char sector;

    // Constructor
    public Libro(String codigo, String titulo, String autor, int stock, double precioCosto, double precioVenta, char sector) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
        this.precioCosto = precioCosto;
        this.sector = sector;

        if (precioVenta <= 0) {
            this.precioVenta = precioCosto * 1.25;
        } else {
            setPrecioVenta(precioVenta);
        }

        aplicarDescuentos();
    }

    // Consultar disponibilidad
    public boolean hayStock() {
        return stock > 0;
    }

    // Actualizar stock
    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
        aplicarDescuentos();
    }

    // Ganancia por unidad
    public double calcularGanancia() {
        return precioVenta - precioCosto;
    }

    // Setter con validación
    public void setPrecioVenta(double nuevoPrecio) {
        if (nuevoPrecio < precioCosto) {
            System.out.println("Error: no puede ser menor al costo");
        } else {
            this.precioVenta = nuevoPrecio;
            aplicarDescuentos();
        }
    }

    // Aplicar descuentos
    private void aplicarDescuentos() {
        double precioFinal = precioVenta;

        if (sector == 'c') {
            precioFinal *= 0.9;
        }

        if (stock > 30) {
            precioFinal *= 0.9;
        }

        if (precioFinal >= precioCosto) {
            precioVenta = precioFinal;
        }
    }

    // Últimos 3 dígitos
    public String getUltimos3Digitos() {
        if (codigo.length() >= 3) {
            return codigo.substring(codigo.length() - 3);
        }
        return codigo;
    }

    // Mostrar info
    public String getInfo() {
        return "Código: " + codigo +
                ", Título: " + titulo +
                ", Autor: " + autor +
                ", Stock: " + stock +
                ", Precio Venta: " + precioVenta;
    }
}