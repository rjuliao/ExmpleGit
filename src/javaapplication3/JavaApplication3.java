/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author raulh
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] vec1, vec2;
        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector n");
        int n = a.nextInt();
        
        
        vec1 = new double[n];
        vec2 = new double[n-1];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese dato en pos["+i+"]");
            vec1[i] = a.nextInt();
        }
        
        System.out.println(Arrays.toString(vec1));
        System.out.println("Pos: ");
        int j = a.nextInt();
//        for (int i = 0; i < n; i++) {
//            if (i != j) {
//                
//                vec2[i] = vec1[i];
//            } else {
//                
//                vec2[i] = vec1[i+1];
//            }
//        }
        int i = 0, k = 0;
        while (i < n && k < (n-1)) {  
            
            if (i != j) {
                
                vec2[k] = vec1[i];
                i++;
                k++;
            } else {
                
                vec2[k] = vec1[i+1];
                i= i+2;
                k++;
            }
            
        }
        System.out.println(Arrays.toString(vec2));
    }
    
}
