import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private ArrayList<Ficha> plantilla=new ArrayList<Ficha>();

    public Equipo(String nombreEquipo, ArrayList<Ficha> plantilla) {
        this.nombreEquipo = nombreEquipo;
        this.plantilla = plantilla;
    }

    public ArrayList<Ficha> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Ficha> plantilla) {
        this.plantilla = plantilla;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", plantilla=" + plantilla +
                '}';
    }


   public boolean comprobarPlantilla(){
        int numPortero=0;
        int numDefensas=0;
        int numCentrocampistas=0;
        int numDelantero=0;
        if(this.plantilla.size()!=5){
            return false;
        }
        for(Ficha f:this.plantilla){
            if(f.getClass()==JugadorCampo.class){
                JugadorCampo jc = (JugadorCampo)f;
                switch(jc.getPosicion()){

                    case "DELANTERO"
                  numDelantero++;
                  break;




              }
            }
            else {
                numPortero++;
            }

        }
        return true;
   }

}
