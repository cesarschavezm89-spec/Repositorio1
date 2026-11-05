package lab4;

public class Guerrero extends Personaje {
    private final int fuerza;
    private final String armadura;

    public Guerrero(String nombre, int nivel, int puntosVida, int fuerza, String armadura) {
        super(nombre, nivel, puntosVida);
        this.fuerza = fuerza;
        this.armadura = armadura;
    }

    public int getFuerza() {
        return fuerza;
    }

    public String getArmadura() {
        return armadura;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("¡" + getNombre() + " golpea con su espada causando "
                + fuerza + " de daño!");
    }

    @Override
    public void defender() {
        System.out.println(getNombre() + " bloquea con su armadura de " + armadura + ".");
    }

    @Override
    public String toString() {
        return "Guerrero{"
                + "personaje=" + super.toString()
                + ", fuerza=" + fuerza
                + ", armadura='" + armadura + '\''
                + '}';
    }
}
