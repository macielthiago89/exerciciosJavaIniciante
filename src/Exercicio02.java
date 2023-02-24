import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        int valor1, valor2, result;
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:")) ;
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
        result = valor1 + valor2;
        System.out.println("Valor da soma é = " + result);
    }    
}
