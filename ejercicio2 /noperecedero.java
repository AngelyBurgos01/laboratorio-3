public class NoPerecedero extends Producto {
    private char tipo;

    public NoPerecedero(String codigo, String descripcion, double precio, char tipo) {
        super(codigo, descripcion, precio);
        this.tipo = validarTipo(tipo);
    }

    private char validarTipo(char tipo) {
        if (tipo == 'A' || tipo == 'B' || tipo == 'C') {
            return tipo;
        }
        return 'B'; 
    }

    @Override
    public double calcularPrecio() {
        switch (tipo) {
            case 'A':
                return precio * 1.03;
            case 'B':
                return precio * 1.02;
            case 'C':
                return precio * 1.015;
            default:
                return precio;
        }
    }

    @Override
    public String toString() {
        return "No Perecedero, " + super.toString() +
               ", Tipo: " + tipo +
               ", Precio venta: $" + calcularPrecio();
    }
}