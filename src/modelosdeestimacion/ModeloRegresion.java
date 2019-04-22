/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosdeestimacion;

/**
 *
 * @author YESID
 */
public class ModeloRegresion {
    
    private String nivelDeComplejidad;
    private float pf;
    
    
    public ModeloRegresion(String nivel) {
        this.nivelDeComplejidad = nivel;
    }
    
    public double getEsfuerzo(float entradas,float salidas,
            float arc_internos, float arc_externos,float consultas){
        float esfuerzo ;
        
        switch(this.nivelDeComplejidad){
            case "SIMPLE":
                this.pf = (3*entradas)+(4*salidas)+(7*arc_internos)+(5*arc_externos)+(3*consultas);
            break;
            case "MEDIO":
                this.pf = (4*entradas)+(5*salidas)+(10*arc_internos)+(7*arc_externos)+(4*consultas);
            break;
            case "COMPLEJO":
                this.pf = (6*entradas)+(7*salidas)+(15*arc_internos)+(10*arc_externos)+(6*consultas);
            break;
        };
        
        return (-12.88 + 0.405*this.pf);
    }
    
}
