package Tarea13;



public class Hilo extends Thread{
    Tarea13.Contador contador;
    public Hilo(Contador c){

        contador = c;
    }

    @Override
    public void run() {
        for(int i=0; i<100000;i++){
            contador.incrementar();
        }
    }
}
