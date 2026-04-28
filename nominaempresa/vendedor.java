public class Vendedor extends Empleado {
    private double totalVentas;

    public Vendedor(String identificacion, String nombre, int edad, int anioIngreso,
                     double salarioBasico, double totalVentas) {
        super(identificacion, nombre, edad, anioIngreso, salarioBasico);
        this.totalVentas = totalVentas;
    }

    public double calcularComision() {
        return totalVentas * 0.15;
    }

    @Override
    public double liquidarNomina() {
        double comision = calcularComision();
        double bruto = salarioBasico + comision;

        int anios = 2026 - anioIngreso;
        if (anios > 20) {
            bruto += 100000;
        }

        double descuento = bruto * 0.10;
        return bruto - descuento;
    }

    @Override
    public String toString() {
        double comision = calcularComision();
        double bruto = salarioBasico + comision;
        double descuento = bruto * 0.10;

        return "Vendedor, " + super.toString() +
                ", " + totalVentas +
                ", " + comision +
                ", " + descuento +
                ", " + liquidarNomina();
    }
}