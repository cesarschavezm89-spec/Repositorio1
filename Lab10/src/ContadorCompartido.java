public class ContadorCompartido {
    private int contador = 0;

    public void incrementar() {
        int valorActual = contador;
        Thread.yield();
        contador = valorActual + 1;
    }

    public synchronized void incrementarSeguro() {
        contador++;
    }

    public int getContador() {
        return contador;
    }

    public void resetear() {
        contador = 0;
    }
}
