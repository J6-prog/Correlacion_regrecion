/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imc;

import frm.VariableY;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Juan
 */
public class calculo {
    
   private double x;
   private double sumax;
   private double sumay;
   private double sumaxC;
   private int tamanio;
   private double sumayC;
   private double sumaxy;
   public ArrayList<Double> xp ;
   public ArrayList<Double> y ;
   public ArrayList<Double> xC ;
   public ArrayList<Double> yC ;
    public ArrayList<Double> xy ;
    
    public void grafic(){
        XYSeries datos = new XYSeries("Altura-Peso");
        for (int i = 0; i < this.xp.size(); i++) {
            datos.add(this.xp.get(i), this.y.get(i));
        }
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(datos);
        
        JFreeChart dis= ChartFactory.createScatterPlot("DIAGRAMA DE DISPERSIÓN", "Altura", "Peso", dataset,PlotOrientation.VERTICAL,true,true,true);
        
        XYPlot plot = dis.getXYPlot();
        
        ChartPanel panel  = new ChartPanel(dis);
        
        JFrame view = new JFrame("Grafica");
        view.setVisible(true);
        view.setSize(600,600);
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        view.add(panel);
    };
   public double sumaX(){
       double sum=0;
       for (int i = 0; i < xp.size(); i++) {
           sum += xp.get(i);
       }
       this.setSumax(sum);
       this.setTamanio(this.xp.size());
     return sum;
   };
   public double sumaY(){
       double sum=0;
       for (int i = 0; i < y.size(); i++) {
           sum += y.get(i);
       }
       this.setSumay(sum);
     return sum;
   };
   public double sumaXC(){
       double sum=0;
       for (int i = 0; i < xC.size(); i++) {
           sum += xC.get(i);
       }
       this.setSumaxC(sum);
     return sum;
   };
   public double sumaYC(){
       double sum=0;
       for (int i = 0; i < yC.size(); i++) {
           sum += yC.get(i);
       }
       this.setSumayC(sum);
     return sum;
   };
   public double sumaXY(){
       double sum=0;
       for (int i = 0; i < xy.size(); i++) {
           sum += xy.get(i);
       }
       this.setSumaxy(sum);
     return sum;
   };
   
     public double SXX(){
        double ssx;
        ssx = this.getSumaxC()-(Math.pow(this.getSumax(), 2)/this.getTamanio());
     
       return ssx;
    }
     public double SXY(){
        
         double sxy;
       sxy = this.getSumaxy()-((this.getSumax()*this.getSumay())/this.getTamanio());
         return sxy;
     };
    public double mediaX(){
        double mX;
        mX = this.getSumax()/this.getTamanio();
        return mX;
    };
     public double mediaY(){
        double mY;
        mY = this.getSumay()/this.getTamanio();
        return mY;
    };
   public double A(){
       
       double a = this.mediaY()-(this.B()*this.mediaX());
       
       return a;
   };
    public double B(){
       double b = 0; 
       b = this.SXY()/this.SXX();
       return b;
   };
    public double AX(){
       
       double a = this.mediaX()-(this.BX()*this.mediaY());
       
       return a;
   };
    public double BX(){
       double b = 0; 
       b = this.SXY()/this.SYY();
       return b;
   };
    public double Y(){
       double y = 0; 
      y = this.A()+(this.B()*this.getX());
       return y;
   };
    public double SYY(){
    double syy = this.getSumayC()-((Math.pow(this.getSumay(), 2))/this.getTamanio());
    return syy;
    };
    public double RY(){
    double r = this.SXY()/(Math.sqrt(this.SXX()*this.SYY()));
    return r;
    };
     public double RX(){
    double r = this.SXY()/(Math.sqrt(this.SYY()*this.SXX()));
    return r;
    };
     
     
    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public double getSumax() {
        
        return sumax;
    }

    public void setSumax(double sumax) {
        this.sumax = sumax;
    }

    public double getSumay() {
        return sumay;
    }

    public void setSumay(double sumay) {
        this.sumay = sumay;
    }

    public double getSumaxC() {
        return sumaxC;
    }

    public void setSumaxC(double sumaxC) {
        this.sumaxC = sumaxC;
    }

    public double getSumayC() {
        return sumayC;
    }

    public void setSumayC(double sumayC) {
        this.sumayC = sumayC;
    }

    public double getSumaxy() {
        return sumaxy;
    }

    public void setSumaxy(double sumaxy) {
        this.sumaxy = sumaxy;
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
