package Trabajo_en_Clase;

public abstract class Pato{

    private ComportamientoVuelo comportamientoVuelo;
    private ComportamientoGraznido comportamientoGraznido;

    public void Nadar(){
        System.out.println("Estoy Nadando");
    }

    public abstract void Dibujar();
       
    
    public void hacerQuack(){
        if (comportamientoGraznido != null) {
        comportamientoGraznido.quack();
    } else {
        System.out.println("No se puede hacer eso pa");
    }
    }
    public void emprenderVuelo(){
        if (comportamientoVuelo != null) {
        comportamientoVuelo.volar();
    } else {
        System.out.println("No se puede hacer eso pa");
    }
    }
    public void establecerComportamientoVuelo(ComportamientoVuelo cv){
        this.comportamientoVuelo = cv;
    }
    public void establecerComportamientoGraznido(ComportamientoGraznido cg){
        this.comportamientoGraznido = cg;

    }
}
