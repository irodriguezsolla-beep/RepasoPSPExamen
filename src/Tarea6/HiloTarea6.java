package Tarea6;

public class HiloTarea6 extends Thread{
    String nombre;
    int paciencia;

    public String getNombre() {
        return nombre;
    }

    public int getPaciencia() {
        return paciencia;
    }

    public HiloTarea6(String nombre, int paciencia){
        super(nombre);
        this.nombre = nombre;
        this.paciencia=paciencia;
    }
    @Override
    public void run(){
        for(int i = 0; i<=paciencia;i++){
            if(i == paciencia){
                System.out.println("["+getNombre()+"]: "+i+"¡He llegado a mi límite!");
            }
            if(i != 0){
                System.out.println("["+getNombre()+"]: "+i);
            }
        }
    }
}
