import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double valor1, valor2;

        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));

        if(valor1 < 0 && valor2 < 0){
            System.out.println("Q3");
        }else if(valor1 == 0 && valor2 == 0){
            System.out.println("Origem");
        }else if(valor1 < 0 && valor2 >0){
            System.out.println("Q2");
        }else if(valor1 > 0 && valor2 < 0){
            System.out.println("Q4");
        }else{
            System.out.println("Q1");
        }
    }
    
}
