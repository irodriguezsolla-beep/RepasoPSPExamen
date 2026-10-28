package Tarea15;

public class HiloTarea15 extends Thread{
    private final int numero;
    private final Thread siguiente;//Una vez asignado un hilo a siguient, no podrás cambiarlo por otro
    public HiloTarea15(int numero,Thread siguiente){
        super("Hilo-"+numero);
        this.numero=numero;
        this.siguiente = siguiente;
    }
    public void run(){
        if (siguiente != null) {
            try {
                siguiente.join();// espero a que acabe el siguiente
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        for (int i=1; i<=8;i++){
            try {
             Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName()+", Iteración: "+ i);
        }
    }
}
