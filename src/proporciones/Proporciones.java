/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proporciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Proporciones {
 private static float[] x;
private static float[] y;
private static Scanner in;

    
    public static void main(String[] args) throws IOException {
        String si;
        BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
        
       do{
        pedirdatos();
        Diferencia();
        
      System.out.println("Escriba si para hacer otra proporcion o cualquier tecla para salir");
       si = bc.readLine();
       }while(si.equalsIgnoreCase("si"));
        
    }

    public static void pedirdatos() throws IOException{
      
       int numsy;
        int nums;
        String si;
        
       
        in = new Scanner(System.in);
           
     System.out.print("Digite cuantos numeros van hacer en el eje y ");
       numsy = in.nextInt();
       y = new float[numsy];
       x = new float[numsy];
       
       
       for(int g =0; g <y.length; g++){
           
           System.out.println("Digite los numeros del eje x");
           x[g] =  in.nextFloat();
   
           
       }
       for(int e =0; e<y.length;e++){
           System.out.println("Digite los numeros del eje y");
          y[e] = in.nextFloat();
                    
       }   
        
    }
    private static  float[] Diferencia(){
     float diferencia[] = new float[y.length];
     float resta = 0;
 boolean yes = false;
 int d;
     for( int r=0;r<y.length-1;r++){
              
      diferencia[r+1] = y[r+1] - y[r];
       
           
     }     
     for(d =1; d<y.length-1;d++){
    // System.out.println("la diferencia de la serie es " +diferencia[d]);
         
      if(diferencia[d+1] == diferencia[d]){
         yes = true;  
        
      }else
          System.out.println("No son proporcionales");       
     }
     if(yes ==true)
    System.out.println("Son proporcionales");     
    System.out.println("La proporcion es de " +diferencia[d]);  
    
   return diferencia;
        
    }
    
}
