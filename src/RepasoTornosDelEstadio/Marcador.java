package RepasoTornosDelEstadio;

public class Marcador {
    public int entradas = 0;

    synchronized void Marcador(int numero){
        entradas = entradas + numero;
    }

    public int getEntradas() {
        return entradas;
    }
}
