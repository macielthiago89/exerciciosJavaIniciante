import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        
        int valor;

        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inteiro: "));
        if( valor <= 0){
            System.out.println("Negativo");
        }
        else{
            System.out.println("Não negativo");
        }
    }
    
}
