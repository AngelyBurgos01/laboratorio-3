public abstract class Empleado {
    protected String identificacion;
    protected String nombre;
    protected int edad;
    protected int anoIngreso;
    protected double salarioBasico;

    public Empleado(String identificacion, String nombre, int edad, int anioIngreso, double salarioBasico) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.anioIngreso = anioIngreso;
        this.salarioBasico = salarioBasico;
    }

    public abstract double liquidarNomina();

    @Override
    public String toString() {
        return identificacion + ", " + nombre + ", " + anioIngreso + ", " + salarioBasico;
    }
}