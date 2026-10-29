package CadenaDeMontajeEnCocina;

public class MainCadenaCocina {
    void main(){
        Cadena Preparacion= new Cadena("Preparacion",null,null);
        Cadena Coccion= new Cadena("Coccion",null,null);
        Cadena Emplatado = new Cadena("Emplatado",Preparacion,Coccion);

        Preparacion.start();
        Coccion.start();
        Emplatado.start();
        try {
            Preparacion.join();
            Coccion.join();
            Emplatado.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Plato listo para servir.");
    }

}
