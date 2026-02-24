public class JugadorCampo extends Ficha{

    private final double ACIERTO_DELANTERO=90;
    private final double ACIERTO_CENTROCAMPISTA=70;
    private final double ACIERTO_DEFENSA=20;
    private Posicion posicion;
    private double porcentajeAcierto;


    public JugadorCampo(String nombre, String mote, int dorsal, Posicion posicion) {
        super(nombre, mote, dorsal);
        this.posicion = posicion;
        this.porcentajeAcierto = calcularPorcentajeAcierto(posicion);

    }

    public JugadorCampo(){
        super();
    }

    public double calcularPorcentajeAcierto(Posicion posicion) {
        switch (posicion) {
            case DELANTERO:
                 return ACIERTO_DELANTERO;

            case CENTROCAMPISTA:
                return ACIERTO_CENTROCAMPISTA;

            case DEFENSA:
                return ACIERTO_DEFENSA;

            default:
                return 0;

        }
    }

    public double getACIERTO_DELANTERO() {
        return ACIERTO_DELANTERO;
    }

    public double getACIERTO_CENTROCAMPISTA() {
        return ACIERTO_CENTROCAMPISTA;
    }

    public double getACIERTO_DEFENSA() {
        return ACIERTO_DEFENSA;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "JugadorCampo{" +
                "nombre:" +this.getNombre() +
                "mote:" +this.getMote() +
                "dorsal:" +this.getDorsal() +
                ", posicion=" + posicion +
                ", porcentajeAcierto=" + porcentajeAcierto +
                '}';
    }
}
