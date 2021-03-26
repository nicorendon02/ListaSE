package com.mycompany.listase;

/**
 *
 * @author nicorendon02
 */
public class ListaSE {
    public Nodo cabeza;

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    @Override
    public String toString() {
        return "ListaSE{" + "cabeza=" + cabeza + '}';
    }
    
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
    
    // Metodo usando un ayudante
    public boolean adicionarNodoAlInicio(Nodo nodo){
        if (cabeza == null){
            cabeza = nodo;
        }
        else{
            Nodo temp = cabeza;
            cabeza = nodo;
            cabeza.setSiguiente(temp);
        }
        return true;
    }
    
    public int contarNodos(){
        if (cabeza == null){
            return 0;
        }
        else{
            int cont = 1;
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null){
                cont++;
                temp = temp.getSiguiente();
            }
            return cont;
        }
    }
    
    public void invertir(){
        if (cabeza != null){
            ListaSE listaTemp = new ListaSE();
            Nodo temp = cabeza;
            while (temp != null){
                Nodo nodoNuevo = new Nodo(temp.getDato(),temp.getSiguiente());  // revisar
                listaTemp.adicionarNodoAlInicio(nodoNuevo);
                temp = temp.getSiguiente();
            }
            cabeza = listaTemp.getCabeza();
        }
    }
}