package Tarea16;

public class MainTarea16 {
    static void main() {
        long inicio = System.currentTimeMillis();
        Ingresos ingresos = new Ingresos();
        Extracciones extracciones = new Extracciones();

        ingresos.start();
        extracciones.start();
        try {
            ingresos.join();
            extracciones.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Saldo final: " + Caja.getCapital());
        System.out.println("Tiempo: " + (System.currentTimeMillis() - inicio) + " ms");
    }
}
