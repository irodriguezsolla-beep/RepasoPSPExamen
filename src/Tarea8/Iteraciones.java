package Tarea8;

import java.util.Random;

public class Iteraciones extends Thread{
    int nombre;

    public Iteraciones(int nombre){
        super("Hilo-"+nombre+": ");
        this.nombre=nombre;
    }

    @Override
    public void run(){
        Random random = new Random();
        int tiempo = random.nextInt(500,2001);
        for (int i =1; i <= 10 ;i++){
            System.out.println(getName()+"iteración "+i);
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Hilo-"+ nombre + " ha terminado");
    }
}
