public class Empresa {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[6];

        empleados[0] = new Vendedor("1", "Ana", 45, 2000, 1200000, 5000000);
        empleados[1] = new Vendedor("2", "Luis", 30, 2015, 1000000, 3000000);
        empleados[2] = new Vendedor("3", "Maria", 50, 1995, 1500000, 7000000);

        empleados[3] = new Repartidor("4", "Carlos", 28, 2020, 900000, 50, 'A');
        empleados[4] = new Repartidor("5", "Pedro", 35, 2018, 950000, 60, 'C');
        empleados[5] = new Repartidor("6", "Sofia", 40, 2010, 1100000, 80, 'X'); // prueba validación

        System.out.println("=== NOMINA ===");

        for (Empleado empleados : empleados) {
            System.out.println(e.toString());
        }
    }
}