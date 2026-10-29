package Estaciondecargadevehiculos;

public class MainEstacionDeRecarga {
    void main(){
        int total = 0;
        Marcador mm = new Marcador();
        Estacion[] estacion = new Estacion[4];

        for(int i=0; i< estacion.length; i++){
            estacion[i]= new Estacion(i,mm);
            estacion[i].start();

        }

        for (Estacion e: estacion){
            try {
                e.join();
                total = total + e.getRecarga();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
        System.out.println("Marcador global de la estación: "+total);
        System.out.println("Suma de los puntos de carga: "+mm.getVh());
    }

}
