package ex1;

import java.util.ArrayList;
import java.util.*;

public class Lista {
    private ArrayList<String> lista = new ArrayList<String>();
    
    public Lista() {
        //lista vazia
    }
    
    public void conferirProd (String prod) {
        if (!this.lista.contains(prod)) addProd(prod);
        else System.out.println("Este poduto ja foi adicionado");
    }
    
    public void addProd (String prod) {
        this.lista.add(prod);
    }
    
    public void ordenaLista () {
        Collections.sort(this.lista);
    }
    
    public void imprimirListaDeCompras() {
        ordenaLista();
        int i;
        for (i=0; i<this.lista.size(); i++) {
            System.out.println("->"+this.lista.get(i));
        }
    }
}
