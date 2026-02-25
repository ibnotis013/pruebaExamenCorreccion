import java.util.ArrayList;

public class Principal {
    private static ArrayList<String> nombreGoleadores = new ArrayList<String>();

    static void main() {


        Portero portero = new Portero("navas",null,1,75);

        // Creamos una lista para almacenar a nuestros jugadores
        ArrayList<JugadorCampo> equipo = new ArrayList<>();

        // --- DEFENSAS ---
        equipo.add(new JugadorCampo("Carles Puyol", "Tiburón", 5, Posicion.DEFENSA));
        equipo.add(new JugadorCampo("Sergio Ramos", "El Faraón", 4, Posicion.DEFENSA));
        equipo.add(new JugadorCampo("Virgil van Dijk", "VVD", 4, Posicion.DEFENSA));

        // --- CENTROCAMPISTAS ---
        equipo.add(new JugadorCampo("Luka Modric", "Cruyff de los Balcanes", 10, Posicion.CENTROCAMPISTA));
        equipo.add(new JugadorCampo("Kevin De Bruyne", "Tintín", 17, Posicion.CENTROCAMPISTA));
        equipo.add(new JugadorCampo("Pedri González", "El Mago", 8, Posicion.CENTROCAMPISTA));
        equipo.add(new JugadorCampo("Jude Bellingham", "Belligol", 5, Posicion.CENTROCAMPISTA));

        // --- DELANTEROS ---
        equipo.add(new JugadorCampo("Lionel Pessi", "La Pulga", 10, Posicion.DELANTERO));
        equipo.add(new JugadorCampo("Kylian Mbappé", "Donatello", 7, Posicion.DELANTERO));
        equipo.add(new JugadorCampo("Erling Haaland", "Cyborg", 9, Posicion.DELANTERO));

        // Ejemplo para verificar que se crearon correctamente
        System.out.println("Lista de Jugadores:");
        for (JugadorCampo j : equipo) {
           detectarGoleador(j.tirarPenalti(portero),j);
        }
        System.out.println(nombreGoleadores);




    }




private static void detectarGoleador(String rp, JugadorCampo jugador) {
    if (rp.startsWith("El jugador: ")) {
        nombreGoleadores.add(jugador.getNombre());
    }

}

}

