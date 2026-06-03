public class Cobro {
    
    // 1. Declaramos la dependencia (atrapada detrás de la interfaz)
    private Deudor deudor;
    
    // 2. Inyectamos la dependencia mediante este método (Setter)
    public void procesarCobro(Deudor deudor) {
        this.deudor = deudor;
    }

    // 3. Método para usar la dependencia de forma segura
    public void mostrarDeuda() {
        if (deudor != null) {
            System.out.println("La deuda procesada es: " + deudor.deuda());
        } else {
            System.out.println("No se ha asignado ningún deudor.");
        }
    }
}