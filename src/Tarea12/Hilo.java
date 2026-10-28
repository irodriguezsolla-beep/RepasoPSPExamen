package Tarea12;

public class Hilo extends Thread{
    Contador contador;
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
