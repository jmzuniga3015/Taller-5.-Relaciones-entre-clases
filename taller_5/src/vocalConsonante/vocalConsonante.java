
package vocalConsonante;

import java.util.Scanner;

/**
 *
 * @author josé zúñiga
 */
public class vocalConsonante {
    
    
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        String palabra;
        int contador1 =0, contador2 =0, consonante, contadorA=0, contadorE=0, contadorI=0,contadorU=0, contadorO=0;
        System.out.println("------------------------------------------------------------");
        System.out.println(" INGRESE TEXTO::: ");
        palabra= entrada.nextLine();
        System.out.println("------------------------------------------------------------");
        
        for(int i=0; i<palabra.length();i++){
            contador1++;
        }
        for (int i=0; i<palabra.length(); i++){
            
            if ((palabra.charAt(i)=='a')||(palabra.charAt(i)=='e')||(palabra.charAt(i)=='i')||(palabra.charAt(i)=='o')||
                    (palabra.charAt(i)=='u')||(palabra.charAt(i)=='I')||(palabra.charAt(i)=='A')||(palabra.charAt(i)=='E')||
                    (palabra.charAt(i)=='O')||(palabra.charAt(i)=='U')){
                
                contador2++;
               
        }
                          if ((palabra.charAt(i)=='a')||(palabra.charAt(i)=='A')){
                    contadorA++;                          
                }
                if ((palabra.charAt(i)=='e')||(palabra.charAt(i)=='E')){
                    contadorE++;                          
                }
                if ((palabra.charAt(i)=='i')||(palabra.charAt(i)=='I')){
                    contadorI++;                          
                }
                if ((palabra.charAt(i)=='o')||(palabra.charAt(i)=='O')){
                    contadorO++;                          
                }
                if ((palabra.charAt(i)=='u')||(palabra.charAt(i)=='U')){
                    contadorU++;                          
                }
                            

                
    
        
    }
            consonante= contador1 - contador2;
        System.out.println("------------------------------------------------------------");
        System.out.println("LA PALABRA :: "+palabra+ "  CONTIENE:: "+contador2+"  VOCALES ");
        System.out.println("LA PALABRA :: "+palabra+ "  CONTIENE:: "+consonante+"  CONSONANTES/n ");
        System.out.println("------------------------------------------------------------");
        
        
        
      System.out.println("NÚMERO DE REPETICIONES DE LAS VOCALES::\n - VOCAL A:: "+contadorA+"\n- VOCAL E:: "+contadorE+"\n-VOCAL I:: "+contadorI+
       "\n-VOCAL O :: "+contadorO+"\n-VOCAL U::  "+contadorU);
   
                
                
        
        
        
    }
    
}
