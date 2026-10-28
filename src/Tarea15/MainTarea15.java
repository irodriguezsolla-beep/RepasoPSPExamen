package Tarea15;

public class MainTarea15 {
    void main(){
        HiloTarea15 h3 = new HiloTarea15 (3, null);
        HiloTarea15  h2 = new HiloTarea15 (2, h3);
        HiloTarea15  h1 = new HiloTarea15 (1, h2);

        h1.start();                     // se arrancan los tres a la vez
        h2.start();
        h3.start();

        try {
            h1.join();                      // el 1 es el último en terminar

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Programa principal terminado.");
    }
}
