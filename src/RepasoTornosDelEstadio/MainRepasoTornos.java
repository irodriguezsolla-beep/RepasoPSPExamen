package RepasoTornosDelEstadio;

public class MainRepasoTornos {
    void main(){
        int marcadorEstadio = 0;
        Tornos[] hilos = new Tornos[4];
        Marcador total= new Marcador();

        for(int i=0; i< hilos.length;i++){
            hilos[i] = new Tornos(i,total);
            hilos[i].start();
        }

        for(Tornos i: hilos){
            try {
                i.join();
                marcadorEstadio = marcadorEstadio + i.getEntradas();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Marcador del estadio: "+marcadorEstadio);
        System.out.println("Suma de los tornos: "+total.getEntradas());

    }
}
