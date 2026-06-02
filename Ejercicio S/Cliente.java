package mal;

/*
 * ACTIVIDAD
 *
 * Esta clase NO cumple el Principio
 * de Responsabilidad Única (SRP).
 *
 * Analiza el código e identifica
 * las diferentes responsabilidades
 * que tiene la clase Cliente.
 *
 * Luego propón una solución
 * aplicando la S de SOLID.
 */

public class Cliente {
    // 1. Atributos privados para proteger la información (Encapsulamiento)
    private String nombre;
    private String correo;
    private int puntos;

    // 2. Constructor: Su único fin es inicializar el objeto con sus datos correspondientes
    public Cliente(String nombre, String correo, int puntos) {
        this.nombre = nombre;
        this.correo = correo;
        this.puntos = puntos;
    }

    // 3. Métodos Getter: Permiten que otras clases lean los datos de forma segura
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public int obtenerPuntos() {
        return puntos;
    }
}