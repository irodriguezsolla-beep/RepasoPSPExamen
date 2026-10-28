package Tarea7;

public class PrimerosNFibonacci extends Thread {
    private final int posicion;
    public PrimerosNFibonacci(int posicion){
        super("Hilo-Fibonacci: ");
        this.posicion=posicion;
    }

    @Override
    public void run() {
        long anterior =1;
        long actual =1;
        for (int i = 0; i <= posicion; i++) {
            if(i==0){
                System.out.println(getName() + "término " + i + ": " + 0);
            }else{
                System.out.println(getName() + "término " + i + ": " + anterior);
                long siguiente = anterior + actual;
                anterior = actual;
                actual = siguiente;
            }

        }
    }
}
