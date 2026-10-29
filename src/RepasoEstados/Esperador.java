package RepasoEstados;

class Esperador extends Thread {
    private final Thread otro;
    public Esperador(Thread otro) { this.otro = otro; }
    public void run() {
        try {
            otro.join();
        } catch (InterruptedException e) { }
    }
}