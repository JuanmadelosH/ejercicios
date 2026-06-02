package mal;

public class impresoraCarnet {
    // Recibe el cliente, extrae su nombre y le da el formato visual requerido
    public void imprimir(Cliente cliente) {
        System.out.println("===== CARNET =====");
        System.out.println("Cliente: " + cliente.obtenerNombre());
        System.out.println("==================");
    }
}
