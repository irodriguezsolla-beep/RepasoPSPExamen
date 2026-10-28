package Tarea13;



public class MainTarea13 {
    void main(){
        Contador c = new Contador();

        Hilo h1 = new Hilo(c);
        Hilo h2 = new Hilo(c);
        Hilo h3 = new Hilo(c);
        Hilo h4 = new Hilo(c);
        Hilo h5 = new Hilo(c);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        try {
            h1.join();
            h2.join();
            h3.join();
            h4.join();
            h5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(c.valor);
    }
}



