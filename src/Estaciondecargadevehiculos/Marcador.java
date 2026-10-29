package Estaciondecargadevehiculos;

public class Marcador {
    int vh;
    public synchronized void cargar(int electricidad){
        vh = vh + electricidad;
    }

    public synchronized int  getVh() {
        return vh;
    }
}
