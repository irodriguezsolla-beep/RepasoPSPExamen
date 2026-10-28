package Tarea14;

class Cocinero extends Thread {

    public Cocinero() {
        super("Cocinero");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("[Cocinero] El guiso está listo");
        } catch (InterruptedException e) {
            System.out.println("[Cocinero] ¡Me han cortado la luz!");
        }
    }
}
