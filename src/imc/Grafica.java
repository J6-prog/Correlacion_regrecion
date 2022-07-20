/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package imc;

import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Juan
 */
public class Grafica{

    JFreeChart grafica;
    XYSeriesCollection datos = new XYSeriesCollection();
    
    String titulo;
    String tx;
    String ty;
    final static int DISPERSION=1;
    
    public Grafica(int tipo){
        this.titulo=titulo;
        genGrafica(tipo);
    };


    
 
    public void genGrafica(int i){
        
        grafica=ChartFactory.createScatterPlot(titulo, tx, ty, datos, PlotOrientation.VERTICAL, true, true, true);
    };
    public void addGrafica(String id,ArrayList<Double> x, ArrayList<Double> y){
        
       XYSeries s = new XYSeries(id); 
       int n=x.size();
        for (int i = 0; i < n; i++) {
            s.add(x.get(i),y.get(i));
        }
        
        datos.addSeries(s);
    };
    
    public JPanel otienePanel(){
        return new ChartPanel(grafica);
    
    };
}
