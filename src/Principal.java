public class Principal {
    static void main() {

        JugadorCampo jugadorCampo = new JugadorCampo();
        JugadorCampo jugadorCampo2 = new JugadorCampo("Djalminha","cojo",5,Posicion.CENTROCAMPISTA);
        Portero portero = new Portero("Casillas",null,1,88);

        System.out.println(jugadorCampo);
        System.out.println(jugadorCampo2);
        System.out.println(portero);


    }
}

