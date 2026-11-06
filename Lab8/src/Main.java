public class Main {
    public static void main(String[] args) throws Exception {
        GestionGremio gremio = new GestionGremio();

        System.out.println("Bloque 1 \u2014 Gesti\u00f3n de roster con ArrayList:");
        gremio.agregarMiembro(new Druida("Sylva", 10, 300, 100));
        gremio.agregarMiembro(new Nigromante("Malachar", 8, 250, 120));
        gremio.agregarMiembro(new Arquero("Legolas", 6, 150, "Arco", 20, 95));
        gremio.agregarMiembro(new Guerrero("Thorin", 9, 400, "Hacha", 80));
        gremio.mostrarRoster();

        gremio.eliminarMiembro("Malachar");
        gremio.mostrarRoster();

        Personaje encontrado = gremio.buscarPorNombre("Legolas");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNombre());
        }

        System.out.println();
        System.out.println("Bloque 2 \u2014 Cola de espera con LinkedList:");
        gremio.encolarSolicitante("Gandalf");
        gremio.encolarSolicitante("Aragorn");
        gremio.encolarSolicitante("Gimli");
        gremio.mostrarCola();

        gremio.atenderSiguiente();
        gremio.mostrarCola();

        System.out.println();
        System.out.println("Bloque 3 \u2014 Inventario con HashMap:");
        gremio.agregarItem("Poci\u00f3n de vida", 5);
        gremio.agregarItem("Flecha \u00e9lfica", 30);
        gremio.agregarItem("Poci\u00f3n de vida", 3);

        gremio.mostrarInventario();

        gremio.usarItem("Poci\u00f3n de vida");
        gremio.usarItem("Pergamino de fuego");
        gremio.mostrarInventario();

        System.out.println();
        System.out.println("Bloque 4 \u2014 Habilidades \u00fanicas con HashSet:");
        gremio.registrarHabilidad("Curaci\u00f3n");
        gremio.registrarHabilidad("Magia oscura");
        gremio.registrarHabilidad("Curaci\u00f3n");

        gremio.mostrarHabilidades();

        System.out.println("\u00bfTiene flecha? " + gremio.tieneHabilidad("Tiro con arco"));
        System.out.println("\u00bfTiene curaci\u00f3n? " + gremio.tieneHabilidad("Curaci\u00f3n"));

        System.out.println();
        System.out.println("Bloque 5 \u2014 Resumen del gremio:");
        gremio.mostrarRoster();
        gremio.mostrarCola();
        gremio.mostrarInventario();
        gremio.mostrarHabilidades();
    }
}
