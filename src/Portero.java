public class Portero extends Ficha {

    private double porcentajeParar;

    public Portero(String nombre, String mote, int dorsal, double porcentajeParar) {
        super(nombre, mote, dorsal);
        this.porcentajeParar = porcentajeParar;

    }

    public Portero(){
        super();
    }

    public double getPorcentajeParar() {
        return porcentajeParar;
    }

    public void setPorcentajeParar(double porcentajeParar) {
        this.porcentajeParar = porcentajeParar;
    }

    @Override
    public String toString() {
        return "Portero{" +
                "porcentajeParar=" + porcentajeParar +
                ", nombre='" + this.getNombre() + '\'' +
                ", mote='" + this.getMote() + '\'' +
                ", dorsal='" + this.getDorsal() + '\'' +
                '}';
    }

}
