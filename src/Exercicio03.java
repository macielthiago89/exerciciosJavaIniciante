import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double area, pi, raio;
        pi = 3.14159;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
        area = pi * Math.pow(raio, 2);
        System.out.printf("A area do circulo é: %.4f", area);
    }
    
}
