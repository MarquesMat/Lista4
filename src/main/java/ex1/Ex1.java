package ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Lista lista = new Lista();
        System.out.print ("Insira um produto ou digite 'xxx' para encerrar a lista: ");
        String prod = teclado.next();
        while (!prod.equals("xxx")) {
            lista.conferirProd(prod);
            System.out.print ("Insira um produto ou digite 'xxx' para encerrar a lista: ");
            prod = teclado.next();
        }
        System.out.println("Lista de compras:");
        lista.imprimirListaDeCompras();
    }
}
