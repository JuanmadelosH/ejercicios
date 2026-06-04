package Trabajo_en_Clase;

public class PatoHule extends Pato {
    
    public PatoHule(){
        establecerComportamientoGraznido(new Chillido());
        establecerComportamientoVuelo(new SinVuelo());
    }

    public void Dibujar(){
        System.out.println("Imaginese un Pato de Hule");
    }
}
