import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int number;
        double valorTrabalho, valorDaHora, salary;

        number = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do funcionario:"));
        valorTrabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhada: "));
        valorDaHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada: "));

        salary = valorDaHora * valorTrabalho;

        System.out.println("Numero do funcionario: " + number);
        System.out.printf("Salario do funcionario é: $%.2f", salary);
    }
    
}
