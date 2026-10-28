package Tarea10;

public class MainTarea10 {
    void main(String[] args) throws InterruptedException {
        final int LIMITE = 1923;
        Tarea10.Sumador pares = new Tarea10.Sumador(Tarea10.Tipo.PARES, LIMITE);
        Tarea10.Sumador impares = new Tarea10.Sumador(Tarea10.Tipo.IMPARES, LIMITE);
        Tarea10.Sumador tresCuatro = new Tarea10.Sumador(Tarea10.Tipo.TERMINAN_EN_3_O_4, LIMITE);

        pares.start();
        impares.start();
        tresCuatro.start();

        pares.join();                  // los resultados solo son válidos
        impares.join();                // después de join()
        tresCuatro.join();

        System.out.println("Suma de pares:                   " + pares.getResultado());
        System.out.println("Suma de impares:                 " + impares.getResultado());
        System.out.println("Suma de los que acaban en 3 o 4: " + tresCuatro.getResultado());

        long esperado = (long) LIMITE * (LIMITE + 1) / 2;
        System.out.println("Comprobación pares + impares = " + esperado + " → "
                + (pares.getResultado() + impares.getResultado() == esperado ? "OK" : "ERROR"));
    }
}
