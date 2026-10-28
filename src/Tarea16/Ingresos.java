package Tarea16;

public class Ingresos extends Thread{
    @Override
    public void run(){
        for(int i=0; i<5000;i++){
                Caja.operar(10);
        }
    }
}
