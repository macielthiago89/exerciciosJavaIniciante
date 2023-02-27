import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        
        int valor1, valor2, result1;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final: "));

        if(valor1 < valor2){
            result1 = valor2 - valor1;
        }else{
            result1 = 24 - valor1 + valor2;
        }
        System.out.println("O jogo durou " + result1 + " hora(s)");
    }
    
}
