/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosdeestimacion;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author YESID
 */
public class Graficar {

    public Graficar() {
    }
    
    public static void generarBarrar(float esfuerzoEcuacion,float esfuerzoCocomo,float regresion){
        try {
            DefaultCategoryDataset dc = new DefaultCategoryDataset();
            dc.addValue(esfuerzoEcuacion, "Ecuacion del Soft.", "");
            dc.addValue(esfuerzoCocomo, "Cocomo Basico", "");
            dc.addValue(regresion, "Regresion", "");
                           
            JFreeChart jf = ChartFactory.createBarChart3D("Modelos de Estimación", "Modelos", "Esfuerzo", dc, PlotOrientation.VERTICAL, true, true, true);
            ChartFrame f = new ChartFrame("Modelos de estimacion", jf);
            f.setSize(500,600);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        } catch (Exception e) {
        }
    }
    
}
