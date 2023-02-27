import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int codigo, qtd;
        double valor;

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto:"));
        qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do prouduto:"));

        if(codigo == 1){
            valor = qtd * 4.00;
            System.out.printf("Total: R$ %.2f", valor);
        }else if(codigo == 2){
            valor = qtd * 4.50;
            System.out.printf("Total: R$ %.2f", valor);
        }else if(codigo == 3){
            valor = qtd * 5.00;
            System.out.printf("Total: R$ %.2f", valor);
        }else if(codigo == 4){
            valor = qtd * 2.00;
            System.out.printf("Total: R$ %.2f", valor);
        }else if(codigo == 5){
            valor = qtd * 1.50;
            System.out.printf("Total: R$ %.2f", valor);
        }
    }
    
}
