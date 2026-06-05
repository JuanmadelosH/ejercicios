package Trabajo_en_Clase;

public class PatoMallard extends Pato {

    public PatoMallard(){

        establecerComportamientoGraznido(new Quack());
        establecerComportamientoVuelo(new VolarConAlas());
    }
    
    @Override

    public void Dibujar(){
        System.out.println("Imaginese un pato Mallard");
    }
}
