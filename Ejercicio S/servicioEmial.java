package mal;

public class servicioEmial {
    // Este método recibe un objeto Cliente para saber a quién enviarle el correo.
    // Nota que la lógica de envío queda completamente fuera de la clase Cliente.
    public void enviarCorreoBienvenida(Cliente cliente) {
        System.out.println("Enviando correo a: " + cliente.obtenerCorreo());
    }
}
