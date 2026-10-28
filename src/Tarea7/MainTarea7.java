package Tarea7;

public class MainTarea7 {
    void main(){
        PrimerosNFibonacci fibonacci = new PrimerosNFibonacci(10);

        fibonacci.start();
        try {
            fibonacci.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Cálculo terminado.");

    }
}
