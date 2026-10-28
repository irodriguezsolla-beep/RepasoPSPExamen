package Tarea8;

public class MainTarea8 {


    void main(){
        long inicio = System.currentTimeMillis();
        Iteraciones[] hilos = new Iteraciones[4];
        for(int i=0;i<4;i++){
            hilos[i] = new Iteraciones(i);
            hilos[i].start();;
        }
        for (Iteraciones h: hilos){
            try {
                h.join();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        long total =System.currentTimeMillis() + inicio;
        System.out.println("Han terminado todos en " + total / 1000.0 + " s");

    }

}
