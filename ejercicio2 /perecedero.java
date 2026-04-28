public class Perecedero extends Producto {
    private int diasCaducar;

    public Perecedero(String codigo, String descripcion, double precio, int diasCaducar) {
        super(codigo, descripcion, precio);
        this.diasCaducar = diasCaducar;
    }

    @Override
    public double calcularPrecio() {
        if (diasCaducar == 1) {
            return precio / 4;
        } else if (diasCaducar == 2) {
            return precio / 3;
        } else if (diasCaducar == 3) {
            return precio / 2;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Perecedero, " + super.toString() +
               ", Dias a caducar: " + diasCaducar +
               ", Precio venta: $" + calcularPrecio();
    }
}