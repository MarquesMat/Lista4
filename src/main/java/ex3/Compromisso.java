package ex3;

import java.util.Date;

public class Compromisso {
    private String titulo, descricao, local;
    private Date data;
    
    public Compromisso() {
    //compromisso vazio
    }
    
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    
    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }
    
    public void setLocal (String local) {
        this.local = local;
    }
    
    public void setData (Date data) {
        this.data = data;
    }
    
    public Date getData() {
        return this.data;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public String getLocal() {
        return this.local;
    }
}
