package Tarea11;

import java.util.Random;

public class HiloPrioridades extends Thread{

    public HiloPrioridades( String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        Random random= new Random();
        int tiempo = random.nextInt(1000,10001);
        for(int i=1;i<=10;i++){
            System.out.println("Nombre del hilo: "+getName()+", Iteración: "+ i+", Prioridad: "+getPriority());
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
