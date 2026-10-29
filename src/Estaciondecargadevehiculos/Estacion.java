package Estaciondecargadevehiculos;

import java.util.Random;

public class Estacion extends Thread{
    public Marcador m;
    Random random = new Random();
    int recarga = 0;

    public Estacion(int nombre,Marcador m){
        super("Punto-"+nombre);
        this.m=m;
    }

    public void run(){
       recarga = random.nextInt(200,600);
       m.cargar(recarga);
       System.out.println(getName()+": "+getRecarga());
    }

    public int getRecarga() {
        return recarga;
    }
}
