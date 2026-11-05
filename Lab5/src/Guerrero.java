public class Guerrero extends Personaje {
    private final int fuerza;
    private final String armadura;

    public Guerrero(String nombre, int nivel, int vida, int fuerza, String armadura) {
        super(nombre, nivel, vida);
        this.fuerza = fuerza;
        this.armadura = armadura;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("¡" + getNombre() + " golpea con su espada causando "
                + fuerza + " de daño!");
    }

    @Override
    public void defender() {
        System.out.println("[" + getNombre() + "] bloquea con " + armadura + ".");
    }

    @Override
    public int calcularDanio() {
        return fuerza * getNivel();
    }
}
