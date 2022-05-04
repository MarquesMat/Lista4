package ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Processador processador = new Processador();
        Fatura fatura = new Fatura ();
        System.out.print("Informe o nome do dono da fatura: ");
        fatura.setNome(teclado.next());
        System.out.print("Informe a data da fatura: ");
        fatura.setData(teclado.next());
        System.out.print("Informe o valor total da fatura: ");
        fatura.setTotal(teclado.nextDouble());
        int i = 1;
        System.out.printf("Digite o valor do boleto %d ou um valor negativo para encerrar o pagamento: ", i);
        double valor = teclado.nextDouble();
        while (valor >= 0) {
            i++;
            Boleto boleto = new Boleto(1000893002, valor, fatura.getData());
            processador.addBoleto(boleto);
            System.out.printf("Digite o valor do boleto %d ou um valor negativo para encerrar o pagamento: ", i);
            valor = teclado.nextDouble();
        }
        i--;
        System.out.printf("Fatura de %.2f com vencimento em %s\n", fatura.getTotal(), fatura.getData());
        System.out.printf("%d boletos:\n", i);
        for (int j=0; j<i; j++) {
            System.out.printf("%.2f\n", processador.getBoleto(j).getValor());
        }
        if (fatura.pagarFatura(processador.pagamento())) System.out.println("\nFATURA MARCADA COMO PAGA");
        else System.out.println("\nFATURA MARCADA COMO NAO PAGA");
        
    }
}