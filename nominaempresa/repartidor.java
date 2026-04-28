public class Repartidor extends Empleado {
    private int numRepartos;
    private char zona;

    public Repartidor(String identificacion, String nombre, int edad, int anioIngreso,
                      double salarioBasico, int numRepartos, char zona) {
        super(identificacion, nombre, edad, anioIngreso, salarioBasico);
        this.numRepartos = numRepartos;
        this.zona = validarZona(zona);
    }

    private char validarZona(char zona) {
        if (zona == 'A' || zona == 'B' || zona == 'C' || zona == 'D') {
            return zona;
        }
        return 'C';
    }

    public double calcularPagos() {
        return numRepartos * 10000;
    }

    @Override
    public double liquidarNomina() {
        double pagos = calcularPagos();
        double bruto = salarioBasico + pagos;

        int anios = 2026 - anioIngreso;
        if (anios >= 5 && zona == 'C') {
            bruto += 50000;
        }

        double descuento = bruto * 0.10;
        return bruto - descuento;
    }

    @Override
    public String toString() {
        double pagos = calcularPagos();
        double bruto = salarioBasico + pagos;
        double descuento = bruto * 0.10;

        return "Repartidor, " + super.toString() +
                ", " + numRepartos +
                ", " + pagos +
                ", " + descuento +
                ", " + liquidarNomina();
    }
}