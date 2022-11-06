/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_edd_eva2_problema2;

/**
 *
 * @author Ana Paulina Villegas Treviño
 *         Iran America Chavarria Monge
 *         Jesus Alberto Jacquez Fabela
 */
public class Matriz_de_adyaciencia {
    
    private int n;
    private int[][] matriz;
    
    /**
     * Constructor de clase
     * @param n numero de nodos
     */
    public Matriz_de_adyaciencia(int n) {
        this.n = n;
        matriz = new int[this.n][this.n];
        //se inicializa matriz en 0
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                matriz[i][j] = 0;
            }            
        }
    }
    
    public void agregar(int i, int j){
        matriz[i][j] += 1;
    }
    
    public void borrar(int i, int j){
        if(matriz[i-1][j-1]>0)
            matriz[i-1][j-1] -= 1;
    }
    
    public void imprimir(){
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                System.out.print( matriz[i][j] + "  " );        
            }
            System.out.println();
        }  
    }
}
