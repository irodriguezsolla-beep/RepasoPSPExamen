package Tarea11;

public class MainTarea11 {
  void main(){
      HiloPrioridades baja = new HiloPrioridades("Hilo1");
      baja.setPriority(Thread.MIN_PRIORITY);

      HiloPrioridades media1 = new HiloPrioridades("Hilo2");
      media1.setPriority(Thread.NORM_PRIORITY);

      HiloPrioridades media2 = new HiloPrioridades("Hilo3");
      media2.setPriority(Thread.NORM_PRIORITY);

      HiloPrioridades alta = new HiloPrioridades("Hilo4");
      alta.setPriority(Thread.MAX_PRIORITY);

      baja.start();
      media1.start();
      media2.start();
      alta.start();

      try {
          baja.join();
          media1.join();
          media2.join();
          alta.join();
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }

  }
}
