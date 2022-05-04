package ex3;

import java.util.ArrayList;
import java.util.Date;

public class Agenda {
    private ArrayList<Compromisso> agenda;
    private ArrayList<Date> difDatas;
    
    public Agenda() {
        this.agenda = new ArrayList<Compromisso>();
        this.difDatas = new ArrayList<Date>();
    }
    
    public void addCompromisso(Compromisso compromisso) {
        this.agenda.add(compromisso);
        if (!this.difDatas.contains(compromisso.getData())) this.difDatas.add(compromisso.getData());
    }

    public Date getData (int i) {
        return this.agenda.get(i).getData();
    }
    
    public Date getDifDatas (int i) {
        return this.difDatas.get(i);
    }
    
    public int getSize() {
        return this.agenda.size();
    }
    
    public int getQtdDias() {
        return this.difDatas.size();
    }
    
    public Date getDias(int i) {
        return this.difDatas.get(i);
    }
    
    public String getTitulo (int i) {
        return this.agenda.get(i).getTitulo();
    }
    
    public String getDescricao(int i) {
        return this.agenda.get(i).getDescricao();
    }
    
    public String getLocal(int i) {
        return this.agenda.get(i).getLocal();
    }
}
