package Trabajo_en_Clase;

public class PatoMandarin extends Pato {
    
    public PatoMandarin(){
        establecerComportamientoGraznido(new Quack());
        establecerComportamientoVuelo(new VolarConAlas());
    }

    @Override
    public void Dibujar(){
        System.out.println("Imaginese un Pato Mandarin");
    }
}
