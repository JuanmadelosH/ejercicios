package Trabajo_en_Clase;

public class Main {
    public static void main(String[] args) {
        Pato Mallard = new PatoMallard();
        Pato Hule = new PatoHule();
        Pato Mandarin = new PatoMandarin();
        Pato Casa = new Pato_de_Casa();

        
        System.out.println("--- PRESENTANDO AL PATO MALLARD ---");
        Mallard.Dibujar();       
        Mallard.Nadar();         
        Mallard.hacerQuack();   
        Mallard.emprenderVuelo(); 
        System.out.println();

        System.out.println("--- PRESENTANDO AL PATO MANDARÍN ---");
        Mandarin.Dibujar();
        Mandarin.hacerQuack();
        Mandarin.emprenderVuelo();
        System.out.println();

        System.out.println("--- PRESENTANDO AL PATO DE HULE ---");
        Hule.Dibujar();
        Hule.hacerQuack();
        Hule.emprenderVuelo();
        System.out.println();

        System.out.println("--- PRESENTANDO AL PATO DE CASA ---");
        Casa.Dibujar();
        Casa.hacerQuack();     
        Casa.emprenderVuelo(); 
        System.out.println();

        //Cambio de comportamiento en tiempo de ejecución
        System.out.println("--- PRUEBA DINÁMICA: ¿Qué pasa si el Pato Mallard pierde las alas? ---");
        System.out.print("Estado de vuelo inicial: ");
        Mallard.emprenderVuelo(); 

        System.out.println("-> Cambiando el chip de vuelo a 'SinVuelo'...");
        // Usamos el Setter para cambiar el objeto de comportamiento en caliente
        Mallard.establecerComportamientoVuelo(new SinVuelo());

        System.out.print("Estado de vuelo actual: ");
        Mallard.emprenderVuelo(); 
        

    }
    
}
