public class Ficha {

    private String nombre;
    private String mote;
    private int dorsal;

    public Ficha(String nombre, String mote, int dorsal) {
        this.nombre = nombre;
        this.mote = mote;
        this.dorsal = dorsal;
    }
    public Ficha(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMote() {
        return mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "nombre='" + nombre + '\'' +
                ", mote='" + mote + '\'' +
                ", dorsal=" + dorsal +
                '}';
    }
}
