package ex2;

public class Boleto {
    private int codigo;
    private double valor;
    private String data;
    
    public Boleto (int codigo, double valor, String data) {
        this.codigo = codigo;
        this.valor = valor;
        this.data = data;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public String getData() {
        return this.data;
    }
}
