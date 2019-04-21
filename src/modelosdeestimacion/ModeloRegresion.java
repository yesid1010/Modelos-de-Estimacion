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

    public ModeloRegresion() {
    }
    
    public float getEsfuerzo(float PF){
        float esfuerzo ;
        esfuerzo = (float)(-12.88 + 0.405 * PF);
        System.out.println("regresion "+esfuerzo);
        return esfuerzo;
        
    }
    
}
