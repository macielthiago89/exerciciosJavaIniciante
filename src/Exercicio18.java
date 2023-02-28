import javax.swing.JOptionPane;

public class Exercicio18 {
    public static void main(String[] args) {
        
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        for(int i = 1; i <= valor; i++){
            if(i % 2 != 0){
                System.out.println("Valor impar: " + i);
            }
        }

    }
    
}
