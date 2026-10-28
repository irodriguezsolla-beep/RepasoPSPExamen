package RepasoCadenaDeMontaje;

public class Estaciones extends Thread{
    private final Thread siguiente;//Una vez asignado un hilo a siguient, no podrás cambiarlo por otro
    private final Thread siguiente2;
    public Estaciones(String nombre,Thread siguiente,Thread siguiente2){
        super(nombre);
        this.siguiente = siguiente;
        this.siguiente2 = siguiente2;
    }

    @Override
    public void run() {
        if (siguiente != null && siguiente2 != null) {
            try {
                siguiente.join();
                siguiente2.join();// espero a que acabe el siguiente
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(getName()+" - "+"paso "+i);
        }
    }

}
