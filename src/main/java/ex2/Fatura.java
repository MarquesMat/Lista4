package ex2;

public class Fatura {
    private String data, nome;
    private double total;
    private boolean paga;
    
    public Fatura () {
        this.paga = false;
    }
    
    public String getData() {
        return this.data;
    }
    
    public double getTotal() {
        return this.total;
    }
    
    public boolean getPaga() {
        return this.paga;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public void setData (String data) {
        this.data = data;
    }
    
    public void setTotal (double total) {
        this.total = total;
    }
    
    public boolean pagarFatura (double total) {
        if (this.total <= total) this.paga = true;
        return this.paga;
    }
}
