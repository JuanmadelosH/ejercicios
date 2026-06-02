package mal;

public class generadorReporte {
    // Recibe el cliente y extrae los puntos para estructurar el reporte
    public void generarReportePuntos(Cliente cliente) {
        System.out.println("Puntos acumulados: " + cliente.obtenerPuntos());
    }
}
