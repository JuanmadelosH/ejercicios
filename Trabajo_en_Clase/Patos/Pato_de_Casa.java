package TRABAJO_EN_CLASE.Patos;

public class Pato_de_Casa extends Pato {

    public Pato_de_Casa(){
        establecerComportamientoGraznido(new Mudo());
        establecerComportamientoVuelo(new VolarConAlas());
    }
    
    public void Dibujar(){
        System.out.println("Imginese un Pato de Casa");
    }
}
