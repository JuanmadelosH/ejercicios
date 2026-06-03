public class Main_ {
    public static void main(String[] args) {
        // 1. Creamos el objeto que maneja la lógica (El cobrador)
        Cobro cobro = new Cobro();

        // 2. Creamos la instancia concreta de Carlos
        carlos carlos = new carlos();

        // 3. INYECCIÓN DE DEPENDENCIA: Le pasamos 'carlos' al objeto 'cobro'
        // Esto funciona porque Carlos es un Deudor.
        cobro.procesarCobro(carlos);

        // 4. Ejecutamos la acción
        cobro.mostrarDeuda();
    }
    
}
