public class Programador implements Presencial, Remoto, Desarrollador {

    public void trabajarEnOficina() {
        System.out.println("Programador: Trabajando hoy desde la oficina.");
    }

    public void trabajarRemoto() {
        System.out.println("Programador: Trabajando hoy desde mi casa.");
    }

    public void escribirCodigo() {
        System.out.println("Programador: Escribiendo código Java limpio aplicando SOLID.");
    }
}