import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double valorA, valorB, ValorC, areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        valorA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
        valorB = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
        ValorC = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));
        
        areaTrianguloRetangulo = (valorA * ValorC) / 2;
        areaCirculo = 3.14159 * Math.pow(ValorC, 2);
        areaTrapezio = ((valorA + valorB) * ValorC) / 2;
        areaQuadrado = Math.pow(valorB, 2);
        areaRetangulo= (valorA * valorB);

        System.out.printf("Triangulo = %.4f%n", areaTrianguloRetangulo);
        System.out.printf("Circulo = %.4f%n", areaCirculo);
        System.out.printf("Trapezio = %.4f%n", areaTrapezio);
        System.out.printf("Quadrado = %.4f%n", areaQuadrado);
        System.out.printf("Retangulo = %.4f%n", areaRetangulo);
    }
    
}
