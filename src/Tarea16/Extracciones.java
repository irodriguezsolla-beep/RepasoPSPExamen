package Tarea16;

public class Extracciones extends Thread{

    public void run(){
        for(int i=0; i<5000;i++){
            Caja.operar(-10);
        }
    }
}
