import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> nombreGoleadores = new ArrayList<String>();

    static void main() {
        Equipo equipo= null;

        //Portero portero = new Portero("navas",null,1,75);

        // Creamos una lista para almacenar a nuestros jugadores

        //ArrayList<Ficha> plantilla = new ArrayList<Ficha>();
        //plantilla.add(portero);
        // --- DEFENSAS ---
        //plantilla.add(new JugadorCampo("Carles Puyol", "Tiburón", 5, Posicion.DEFENSA));
        //plantilla.add(new JugadorCampo("Sergio Ramos", "El Faraón", 4, Posicion.DEFENSA));
        //plantilla.add(new JugadorCampo("Virgil van Dijk", "VVD", 4, Posicion.DEFENSA));

        // --- CENTROCAMPISTAS ---
        //plantilla.add(new JugadorCampo("Luka Modric", "Cruyff de los Balcanes", 10, Posicion.CENTROCAMPISTA));
        //plantilla.add(new JugadorCampo("Kevin De Bruyne", "Tintín", 17, Posicion.CENTROCAMPISTA));
        //plantilla.add(new JugadorCampo("Pedri González", "El Mago", 8, Posicion.CENTROCAMPISTA));
        //plantilla.add(new JugadorCampo("Jude Bellingham", "Belligol", 5, Posicion.CENTROCAMPISTA));

        // --- DELANTEROS ---
        //plantilla.add(new JugadorCampo("Lionel Pessi", "La Pulga", 10, Posicion.DELANTERO));
        //plantilla.add(new JugadorCampo("Kylian Mbappé", "Donatello", 7, Posicion.DELANTERO));
        //plantilla.add(new JugadorCampo("Erling Haaland", "Cyborg", 9, Posicion.DELANTERO));


        // Ejemplo para verificar que se crearon correctamente

       // for (Ficha j : plantilla) {
         //  detectarGoleador(j.tirarPenalti(portero),j);
        //}
        //System.out.println(nombreGoleadores);

        /*    1. Crear Equipo: Pone nombre al equipo.
    2. Fichar Jugadores: Añade los jugadores a la plantilla.
    3. Validar Equipo: Usa el metodo convocatoria para ver si la alineación es correcta.
    4. Tanda de Penaltis:
        ◦ Hacen que los 4 jugadores de campo (defensa, centrocampistas y delantero) tiren un penalti cada uno al portero.*/



        do {
            System.out.println("1. Crea el equipo \n" +
                    "2. Ficha jugadores\n" +
                    "3. Valida el equipo\n" +
                    "4. Tanda de penaltis");
            switch(sc.nextInt()) {
                case 1:
                    //1. Crear Equipo: Pone nombre al equipo.
                    System.out.println("creando equipo");
                    System.out.println("ingrese el nombre del equipo");
                    sc.nextLine();
                    String nombreEquipo = sc.nextLine();
                    equipo = new Equipo(nombreEquipo);
                    break;
                case 2:
                    //Fichar Jugadores: Añade los jugadores a la plantilla.
                    for (int i = 0; i <5; i++) {
                        if (equipo!=null){
                            equipo.getPlantilla().add(solicitarDatosFicha()) ;
                        }

                    }
                case 3:
                    //Validar Equipo: Usa el metodo convocatoria para ver si la alineación es correcta.

                case 4:
                    //tanda de panalti, Hacen que los 4 jugadores de campo (defensa, centrocampistas y delantero) tiren un penalti cada uno al porter


                default:
                    System.out.println("opcion invalida, introduzca una opcion correcta");
            }
        }
        while (true);
    }


private static Ficha solicitarDatosFicha(){

    System.out.println("introduce el nombre del jugador");
    sc.nextLine();
    String nombrejugador = sc.nextLine();
    System.out.println("¿Tiene mote? (S/N)");
    String respuesta = sc.nextLine();
    String mote =null;
    if (respuesta.equalsIgnoreCase("S")) {
        System.out.println("introduce el mote");
        mote = sc.nextLine();
    }

    System.out.println("introduce el dorsal");
    int dorsal = sc.nextInt();
    System.out.println("quieres crear un portero (P) o un jugador(JC)");
    sc.nextLine();
    String decision = sc.nextLine();
    if (decision.equalsIgnoreCase("P")) {
    return solicitarDatosPortero(nombrejugador,mote,dorsal);
    }
    else{
        return solicitarDatosJugadorCampo(nombrejugador,mote,dorsal);
    }

}

private static JugadorCampo solicitarDatosJugadorCampo(String nombrejugador,String mote,int dorsal){
    System.out.println("introduzca la posicion del jugador (DELANTERO/CENTROCAMPISTA/DEFENSA)");
    Posicion posicion=null;
    boolean salida=true;
    do {
        switch(sc.nextLine()) {

            case "DELANTERO":
            posicion =Posicion.DELANTERO;
            salida=false;
            break;

            case "CENTROCAMPISTA":
            posicion =Posicion.CENTROCAMPISTA;
            salida=false;
            break;

            case "DEFENSA":
            posicion =Posicion.DEFENSA;
            salida=false;
            break;

            default:
                System.out.println("opcion invalida, introduce la posicion del jugador");
                break;
        }
    }while(salida);
    return new JugadorCampo(nombrejugador,mote,dorsal,posicion);
}

private static Portero solicitarDatosPortero(String nombrejugador,String mote,int dorsal){
    System.out.println("introduzca el porcentaje de parada del portero");
    double porcentaje = sc.nextDouble();
    return new Portero(nombrejugador,mote,dorsal,porcentaje);

}
private static void detectarGoleador(String rp, JugadorCampo jugador) {
    if (rp.startsWith("El jugador: ")) {
        nombreGoleadores.add(jugador.getNombre());
    }

}

}

