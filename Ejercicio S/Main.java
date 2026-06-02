package mal;

/*
 * EJERCICIO
 *
 * Observa el funcionamiento del programa.
 *
 * ¿Qué responsabilidades podrían
 * separarse en clases diferentes?
 *
 * Justifica tu respuesta utilizando
 * el Principio de Responsabilidad Única.
 */

public class Main {

    public static void main(String[] args) {
        // 1. Creamos la instancia con los datos del cliente
        Cliente cliente = new Cliente("Carlos Pérez", "carlos@gmail.com", 150);

        // 2. Instanciamos nuestros servicios especializados
        impresoraCarnet impresora = new impresoraCarnet();
        servicioEmial servicioEmail = new servicioEmial();
        generadorReporte generadorReportes = new generadorReporte();

        // 3. Ejecutamos las acciones pasando el cliente como argumento
        impresora.imprimir(cliente);
        servicioEmail.enviarCorreoBienvenida(cliente);
        generadorReportes.generarReportePuntos(cliente);
    }
}