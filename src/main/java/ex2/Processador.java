package ex2;

import java.util.ArrayList;

public class Processador {
    private ArrayList<Boleto> boletos;
    private double totalPago;
    
    public Processador() {
        this.boletos = new ArrayList<Boleto>();
        this.totalPago = 0;
    }
    
    public Boleto getBoleto(int j) {
        return this.boletos.get(j);
    }
    
    public double pagamento() {
        for (int i = 0; i<this.boletos.size(); i++) {
            this.totalPago += this.boletos.get(i).getValor();
        }
        return this.totalPago;
    }
    
    public void addBoleto(Boleto boleto) {
        this.boletos.add(boleto);
    }
}
