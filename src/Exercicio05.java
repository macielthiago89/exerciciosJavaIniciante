import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int codP1, codP2, qtdP1, qtdP2;
        double valorP1, valorP2, resultP1, resultP2, resultTotal;

        codP1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da peça 01: "));
        qtdP1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de peças 01: "));
        valorP1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitario da peça 01: "));     

        codP2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da peça 02: "));
        qtdP2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de peças 02: "));
        valorP2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitario da peça 02: "));

        resultP1 = qtdP1 * valorP1;
        resultP2 = qtdP2 * valorP2;

        resultTotal = resultP1 + resultP2;

        System.out.printf("Valor a pagar: R$ %.2f ", resultTotal);
    }
    
}
