package ex3;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.DateFormat;
import java.util.Locale;

public class Ex3 {
    public static void imprimirAgenda (Agenda agenda, Date data) {
        for (int i=0; i<agenda.getSize(); i++) {
            if (agenda.getData(i).equals(data)) {
                System.out.println("\nTITULO: "+agenda.getTitulo(i));
                System.out.println("DESCRICAO: "+agenda.getDescricao(i));
                System.out.println("LOCAL: "+agenda.getLocal(i));
            }
        }
    }
    
    public static void diasAgendaPadrao (Agenda agenda) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //retorna uma string
        for (int i=0; i<agenda.getQtdDias(); i++) {
            System.out.print("\n\nCOMPROMISSOS DO DIA "+sdf.format(agenda.getData(i)));
            imprimirAgenda (agenda, agenda.getDifDatas(i));
        }
    }
    
    public static void diasAgendaExtenso (Agenda agenda, int v) {
        if (v == 0) {
            Locale brasil = new Locale("pt", "BR");
            DateFormat f = DateFormat.getDateInstance(DateFormat.FULL, brasil);
            for (int i=0; i<agenda.getQtdDias(); i++) {
                System.out.print("\n\nCOMPROMISSOS DO DIA "+f.format(agenda.getData(i)));
                imprimirAgenda (agenda, agenda.getDifDatas(i));
            }
        }
        else {
            for (int i=0; i<agenda.getQtdDias(); i++) {
                System.out.print("\n\nCOMPROMISSOS DO DIA "+agenda.getData(i));
                imprimirAgenda (agenda, agenda.getDifDatas(i));
            }
        }
    }
    
    public static void main(String[] args) throws ParseException {
        Scanner teclado = new Scanner(System.in);
        Date data;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //retorna uma string
        Agenda agenda = new Agenda();
        System.out.print("Insira um novo compromisso ou digite 'xxx' para fechar a agenda: ");
        String titulo = teclado.next();
        while (!titulo.equals("xxx")) {
            Compromisso compromisso = new Compromisso();
            compromisso.setTitulo(titulo);
            teclado.nextLine(); //evitar erro ao inserir muitas frases
            System.out.print("Informe a descricao: ");
            compromisso.setDescricao(teclado.nextLine());
            System.out.print("Informe o local: ");
            compromisso.setLocal(teclado.nextLine());
            System.out.print("Informe a data: ");
            data = sdf.parse(teclado.next());
            compromisso.setData(data);
            teclado.nextLine();//evitar erro ao inserir muitas frases
            agenda.addCompromisso(compromisso);
            System.out.print("\nInsira um novo compromisso ou digite 'xxx' para fechar a agenda: ");
            titulo = teclado.next();
        }
        System.out.print("\nSelecione a data por extenso(1) ou padrao(0): ");
        if (teclado.nextInt() == 0) diasAgendaPadrao (agenda);
        else {
            System.out.print("Selecione ingles(1) ou portugues(0): ");
            diasAgendaExtenso (agenda, teclado.nextInt());
        }
    }
}
