package Tarea14;

public class MainTarea14 {
    void main(){
        Cocinero cocinero = new Cocinero();

        System.out.println("(1) " + cocinero.getState());
        cocinero.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("(2) " + cocinero.getState());
        cocinero.interrupt();
        try {
            cocinero.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("(3) " + cocinero.getState());
    }
}
