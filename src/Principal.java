import java.util.ArrayList;

public class Principal {
    private static ArrayList<String> nombreGoleadores = new ArrayList<String>();

    static void main() {


        Portero portero = new Portero("navas",null,1,75);

        // Creamos una lista para almacenar a nuestros jugadores

        ArrayList<Ficha> plantilla = new ArrayList<Ficha>();
        plantilla.add(portero);
        // --- DEFENSAS ---
        //plantilla.add(new JugadorCampo("Carles Puyol", "Tiburón", 5, Posicion.DEFENSA));
        plantilla.add(new JugadorCampo("Sergio Ramos", "El Faraón", 4, Posicion.DEFENSA));
        //plantilla.add(new JugadorCampo("Virgil van Dijk", "VVD", 4, Posicion.DEFENSA));

        // --- CENTROCAMPISTAS ---
        plantilla.add(new JugadorCampo("Luka Modric", "Cruyff de los Balcanes", 10, Posicion.CENTROCAMPISTA));
        //plantilla.add(new JugadorCampo("Kevin De Bruyne", "Tintín", 17, Posicion.CENTROCAMPISTA));
        //plantilla.add(new JugadorCampo("Pedri González", "El Mago", 8, Posicion.CENTROCAMPISTA));
        plantilla.add(new JugadorCampo("Jude Bellingham", "Belligol", 5, Posicion.CENTROCAMPISTA));

        // --- DELANTEROS ---
        //plantilla.add(new JugadorCampo("Lionel Pessi", "La Pulga", 10, Posicion.DELANTERO));
        plantilla.add(new JugadorCampo("Kylian Mbappé", "Donatello", 7, Posicion.DELANTERO));
        //plantilla.add(new JugadorCampo("Erling Haaland", "Cyborg", 9, Posicion.DELANTERO));

        Equipo madrid= new Equipo("Real Madrid",plantilla);
        // Ejemplo para verificar que se crearon correctamente
        System.out.println("Lista de Jugadores:");
       // for (Ficha j : plantilla) {
         //  detectarGoleador(j.tirarPenalti(portero),j);
        //}
        //System.out.println(nombreGoleadores);

        madrid.comprobarPlantilla();



    }




private static void detectarGoleador(String rp, JugadorCampo jugador) {
    if (rp.startsWith("El jugador: ")) {
        nombreGoleadores.add(jugador.getNombre());
    }

}

}

