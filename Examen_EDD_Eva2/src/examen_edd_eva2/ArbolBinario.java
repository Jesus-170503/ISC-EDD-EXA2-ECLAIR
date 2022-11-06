/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_edd_eva2;

/**
 *
 * @author Ana Paulina Villegas Treviño
 *         Iran America Chavarria Monge
 *         Jesus Alberto Jacquez Fabela
 */
public class ArbolBinario {
     private Nodo root;

    public ArbolBinario() {
        this.root = null;
    }
    public void agregar(String valor){
        if (root==null)
            root = new Nodo(valor);
        else
        agregarRecur(valor, root);
    }
    
    private void agregarRecur(String valor, Nodo nodoActual){
        Nodo nuevo = new Nodo(valor);
        
        
        if (valor.compareTo(nodoActual.getValor()) < 0){//Va a la izq   myStr1.compareTo(myStr2)
            if (nodoActual.getIzquierda()==null)   // null = vacio
            nodoActual.setIzquierda(nuevo);
            else
                agregarRecur(valor, nodoActual.getIzquierda());
            
        }else if (valor.compareTo(nodoActual.getValor()) > 0){ // va a la der
         if (nodoActual.getDerecha()==null)
            nodoActual.setDerecha(nuevo);
            else
                agregarRecur(valor, nodoActual.getDerecha());
        }else {
           
            System.out.println("Valor repetido");
        }
        
    }
    
    public void inOrder(){
        inOrderRecu(root);
        System.out.println("");
    }
    private void inOrderRecu(Nodo nodo){
        if(nodo != null){
            
            inOrderRecu(nodo.getIzquierda());
            System.out.print(nodo.getValor() + "-");
            inOrderRecu(nodo.getDerecha());
            
        }
        
    }
    
     public void posOrder(){
        posOrderRecu(root);
        System.out.println("");
    }
    private void posOrderRecu(Nodo nodo){
        if(nodo != null){
            
            posOrderRecu(nodo.getIzquierda());
            posOrderRecu(nodo.getDerecha());
            System.out.print(nodo.getValor() + "-");
        }
        
    }
    
      public void preOrder(){
        preOrderRecu(root);
        System.out.println("");
    }
    private void preOrderRecu(Nodo nodo){
        if(nodo != null){
            
            System.out.print(nodo.getValor() + "-");
            preOrderRecu(nodo.getIzquierda());
            preOrderRecu(nodo.getDerecha());
            
        }
        
    }
      

}
