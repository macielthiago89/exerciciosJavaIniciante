import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double sal, valor1;

        sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario: "));

        if(sal <= 2000.00){
            System.out.println("Isento");
        }else if(sal >= 2000.01 && sal <= 3000.00){
            valor1 = (sal - 2000.00) * 0.08;
            System.out.printf("R$ %.2f", valor1);
        }else if(sal >= 3000.01 && sal <= 4500.00){
            valor1 = (sal - 3000.00) * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f", valor1);
        }else if (sal > 4500.01){
            valor1 = (sal - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f", valor1);
        }
    }
    
}
