/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_edd_eva2;

import java.util.Scanner;

/**
 *
 * @author Ana Paulina Villegas Treviño
 *         Iran America Chavarria Monge
 *         Jesus Alberto Jacquez Fabela
 */
public class Examen_EDD_Eva2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        ArbolBinario tree = new ArbolBinario();
        System.out.println("Cuantas palabras desea introducir");
        int n=input.nextInt();
      
        for ( int i = 0; i < n; i++) {
            System.out.println("Ingrese la primer palabra " + (i+1));
            String palabra = input.next();
            tree.agregar(palabra);
        }
        System.out.println("inOrder: ");
        tree.inOrder();
        System.out.println("posOrder: ");
        tree.posOrder();
        System.out.println("preOrder: ");
        tree.preOrder();
        
    }
    
}
