package lab4;

public class Personaje implements Combatiente {
    private final String nombre;
    private final int nivel;
    private int puntosVida;
    private boolean estaVivo;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.estaVivo = puntosVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void recibirDanio(int danio) {
        if (danio < 0) {
            throw new IllegalArgumentException("El daño no puede ser negativo.");
        }

        boolean estabaVivo = estaVivo;
        puntosVida = Math.max(0, puntosVida - danio);
        estaVivo = puntosVida > 0;

        System.out.println(nombre + " recibe " + danio
                + " puntos de daño. Vida restante: " + puntosVida);
        if (estabaVivo && !estaVivo) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con un golpe básico.");
    }

    @Override
    public void defender() {
        System.out.println(nombre + " se pone en guardia.");
    }

    @Override
    public String toString() {
        return "Personaje{"
                + "nombre='" + nombre + '\''
                + ", nivel=" + nivel
                + ", puntosVida=" + puntosVida
                + ", estaVivo=" + estaVivo
                + '}';
    }
}
