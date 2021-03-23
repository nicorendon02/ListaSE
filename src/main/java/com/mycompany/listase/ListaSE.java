package com.mycompany.listase;

/**
 *
 * @author nicorendon02
 */
public class ListaSE {
    public Nodo cabeza;

    public boolean adicionarNodo(Nodo nodo){
        if (cabeza == null){
            cabeza = nodo;
        }
        else{
            Nodo temp = cabeza;
            
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nodo);
        }
        return true;
    }
    

}