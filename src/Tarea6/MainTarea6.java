package Tarea6;

public class MainTarea6 {
    void main(){
        HiloTarea6 Damian = new HiloTarea6("Damian",3);
        HiloTarea6 Diego = new HiloTarea6("Diego",3);
        HiloTarea6 Juan = new HiloTarea6("Juan",3);
        HiloTarea6 Manuel = new HiloTarea6("Manuel",3);

        Damian.start();
        Diego.start();
        Juan.start();
        Manuel.start();

        try{
            Damian.join();
            Diego.join();
            Juan.join();
            Manuel.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
