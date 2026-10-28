package Tarea10;

public class Tarea10 {

    enum Tipo { PARES, IMPARES, TERMINAN_EN_3_O_4 }

    static class Sumador extends Thread {
        private final Tipo tipo;
        private final int limite;
        private long resultado;

        public Sumador(Tipo tipo, int limite) {
            super("Sumador-" + tipo);
            this.tipo = tipo;
            this.limite = limite;
        }

        @Override
        public void run() {
            for (int i = 1; i <= limite; i++) {
                if (cumple(i)) resultado += i;
            }
        }

        private boolean cumple(int i) {
            switch (tipo) {
                case PARES:   return i % 2 == 0;
                case IMPARES: return i % 2 != 0;
                default:      return i % 10 == 3 || i % 10 == 4;
            }
        }

        public long getResultado() { return resultado; }
    }
}
