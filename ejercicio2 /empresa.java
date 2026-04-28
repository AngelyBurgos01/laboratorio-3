public class Empresa {
    public static void main(String[] args) {

        Producto[] productos = new Producto[6];

        productos[0] = new Perecedero("P1", "Leche", 5000, 1);
        productos[1] = new Perecedero("P2", "Carne", 10000, 2);
        productos[2] = new Perecedero("P3", "Queso", 8000, 3);

        productos[3] = new NoPerecedero("NP1", "Arroz", 3000, 'A');
        productos[4] = new NoPerecedero("NP2", "Lentejas", 2500, 'B');
        productos[5] = new NoPerecedero("NP3", "Frijoles", 2800, 'X'); // prueba validación

        System.out.println("=== LISTA DE PRODUCTOS ===");

        for (Producto p : productos) {
            System.out.println(p.toString());
        }
    }
}