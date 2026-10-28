package RepasoCadenaDeMontaje;

public class MainRepasoCadenaDeMontaje{
    void main(){
        Estaciones Esamblaje = new Estaciones("Esamblaje",null,null);
        Estaciones Corte = new Estaciones("Corte",null,null);
        Estaciones Pintura = new Estaciones("Pintura",Esamblaje,Corte);


        Esamblaje.start();
        Corte.start();
        Pintura.start();

        try {
            Esamblaje.join();
            Corte.join();
            Pintura.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Producto terminado.");
    }
}
