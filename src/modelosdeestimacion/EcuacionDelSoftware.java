/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosdeestimacion;

/*
    Valor de B (Factor de destreza)

    LDC = 5K -> 15K, B = 0.16
    LDC > 70K, b = 0.39

*/

/*
    Valor de P (Parametro de productividad : Tipo de software)

    P = 2000  (Software empotrado en tiempo real)
    P = 10000 (Telecomunicaciones y software de sistemas)
    P = 28000 (aplicaciones comerciales de sistemas)
*/

public class EcuacionDelSoftware{
    private double B; //Factor de destreza
    private final double LDC; //Lineas de codigo -> KLDC
    private final double P; //Productividad
    
    public EcuacionDelSoftware(double LDC, double P){
        this.LDC = LDC;
        this.P  = P;
        calcularB();
    }
    
    private void calcularB(){
        if(LDC >= 5000.0 && LDC <=15000.0) this.B = 0.16;
        else if(LDC >= 15001.0 && LDC <= 70000.0) this.B = 0.28;
        else B = 0.39;          
    }
    
    public static String ComboProductividad(String productividad){
        if(productividad.equals("Empotrado")){productividad = "2000.0";
        }else if (productividad.equals("Aplicaciones Comerciales")){productividad = "28000.0";
        }else{productividad = "10000.0";}
        
        return productividad;
    }
    public double getTiempoMinimo(){ return 8.14*(Math.pow(LDC/P, 0.433)); }
    public double getEsfuerzo(){ return 180*B*Math.pow(this.getTiempoMinimo()/12.0, 3); }
    
}
