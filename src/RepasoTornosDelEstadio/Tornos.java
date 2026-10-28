package RepasoTornosDelEstadio;

import java.util.Random;

public class Tornos extends Thread{
    public int entradas;
    public Random aleatorio = new Random();
    Marcador CMarcador;

    public Tornos(int nombre,Marcador CMarcador){
        super("Hilo-"+nombre);
        this.CMarcador = CMarcador;
    }

    public void run(){
        entradas = aleatorio.nextInt(500,1001);
        CMarcador.Marcador(entradas);
        System.out.println(getName()+": "+getEntradas());
    }

    public int getEntradas() {
        return entradas;
    }
}
