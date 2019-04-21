package modelosdeestimacion;

import java.util.ArrayList;

/*
    Tipo de Proyecto     a       b       c       d
    Orgánico            2.4     1.05    2.5     0.38
    Medio               3.0     1.12    2.5     0.35
    Embebido            3.6     1.20    2.5     0.32
*/

public class CocomoBasico {
    private final double KLDC;
    
    class TipoProyecto{
        private String tipo;
        double indices[];

        public TipoProyecto(String tipo){
            this.tipo = tipo;
            initIndices();
        }

        private void initIndices(){
            indices = new double[4];

            switch(tipo){
                case "Organico":
                    indices[0] = 2.4;
                    indices[1] = 1.05;
                    indices[2] = 2.5;
                    indices[3] = 0.38;
                    break;
                case "Medio":
                    indices[0] = 3.0;
                    indices[1] = 1.12;
                    indices[2] = 2.5;
                    indices[3] = 0.35;
                    break;
                case "Embebido":
                    indices[0] = 3.6;
                    indices[1] = 1.2;
                    indices[2] = 2.5;
                    indices[3] = 0.32;
                default:
                    System.out.println("°|°");
            }
        }

       public double[] getIndices(){ return indices; }
    }
    
    private TipoProyecto tipoProyecto; 
    
    public CocomoBasico(double KLDC, String tipo){
        this.KLDC = KLDC;
        tipoProyecto = new TipoProyecto(tipo);
    }
    
    public double getEsfuerzo(){ return (tipoProyecto.getIndices()[0])*Math.pow(KLDC/1000.0, tipoProyecto.getIndices()[1]); }
}

