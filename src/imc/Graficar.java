/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imc;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Juan
 */
public class Graficar extends JFrame{
    private ArrayList<Double> x;
   private ArrayList<Double> y;
   
    public Graficar(){
   
    
    }
    public void resList(ArrayList<Double> x,ArrayList<Double> y ){
        this.x = x;
        this.y = y;
    }
 }

