/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_edd_eva2_problema2;

import java.util.Scanner;

/**
 *
 * @author Ana Paulina Villegas Treviño
 *         Iran America Chavarria Monge
 *         Jesus Alberto Jacquez Fabela
 */
public class Examen_EDD_Eva2_problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Cuantos grafos insertara");
        int n = input.nextInt();
        Lista_adyaciencia lista = new Lista_adyaciencia(n);

        int[][] nodos = new int[n][];

        for (int i = 0; i < nodos.length; i++) {
            System.out.println("Numero de conexiones del grafo " + (i + 1));
            int conexiones = input.nextInt();
            nodos[i] = new int[conexiones];
            for (int j = 0; j < nodos[i].length; j++) {
                System.out.println("ingrese del nodo que sale : ");
                int x = input.nextInt();
                x--;
                System.out.println("ingrese al nodo que llega : ");
                int y = input.nextInt();
                y--;
                lista.agregar(x, y);

            }
        }

        System.out.println("");
        System.out.println("Lista de adyacencia");
        lista.imprimir();
        System.out.println("Borrar la conexion (4,3)");
        lista.borrar(4, 3);
        System.out.println("Lista de adyacencia");
        lista.imprimir();

       /* System.out.println("------------------------------------------------------------");
        System.out.println("Matriz de adyacencia");

        System.out.println("Cuantos grafos insertara");
        int c = input.nextInt();
        Lista_adyaciencia matriz = new Lista_adyaciencia(c);

        int[][] nodos1 = new int[c][];

        for (int i = 0; i < nodos1.length; i++) {
            System.out.println("Numero de conexiones del grafo " + (i + 1));
            int conexiones1 = input.nextInt();
            nodos1[i] = new int[conexiones1];
            for (int j = 0; j < nodos1[i].length; j++) {
                System.out.println("ingrese del nodo que sale : ");
                int x = input.nextInt();
                x--;
                System.out.println("ingrese al nodo que llega : ");
                int y = input.nextInt();
                y--;
                matriz.agregar(x, y);

            }
        }

        System.out.println("");
        System.out.println("Lista de adyacencia");
        matriz.imprimir();
        System.out.println("Borrar la conexion (4,3)");
        matriz.borrar(4, 3);
        System.out.println("Lista de adyacencia");
        matriz.imprimir(); */

    }

}
