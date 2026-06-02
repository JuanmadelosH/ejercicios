public class Main {
    public static void main(String[] args) {
        // Creamos a nuestros dos trabajadores
        Programador programador = new Programador();
        JefeDeSoporte jefe = new JefeDeSoporte();

        System.out.println("=== RUTINA DEL PROGRAMADOR ===");
        programador.escribirCodigo();
        programador.trabajarRemoto();

        System.out.println("\n=== RUTINA DEL JEFE DE SOPORTE ===");
        jefe.gestionarEquipo();
        jefe.atenderClientes();
        jefe.trabajarEnOficina();
    }
}
