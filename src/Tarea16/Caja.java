package Tarea16;

public class Caja {
    public static double capital = 1000.0;
    public static synchronized void operar(double cantidad){
        double saldo = capital;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        capital = saldo + cantidad;
    }
    public static synchronized double getCapital() {
        return capital;
    }
}
