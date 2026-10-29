package CadenaDeMontajeEnCocina;

public class Cadena extends Thread{
    Thread Estacion1;
    Thread Estacion2;
    public Cadena(String nombre,Thread Estacion1,Thread Estacion2){
        super(nombre);
        this.Estacion1 =Estacion1;
        this.Estacion2 =Estacion2;
    }

    public void run(){
        for(int i=1; i<=5 ; i++ ){
            if (Estacion1 != null && Estacion2 != null){

                try {
                    Estacion1.join();
                    Estacion2.join();
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(getName()+"- Paso "+i);
        }

    }
}
