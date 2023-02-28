import javax.swing.JOptionPane;

public class Exercicio21 {
    public static void main(String[] args) {
        
        int valor;
        int fat = 1;

        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));

        for(int i = 1; i <= valor; i++){

            fat = fat * i;
        }
        System.out.println(fat);
    }
    
}
