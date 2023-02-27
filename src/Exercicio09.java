import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {
        
        int valor1, valor2;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

        if( valor1 % valor2 == 0 || valor2 % valor1 == 0){
            System.out.println("São multiplos");
        }else{
            System.out.println("Não são multiplos");
        }
    }
    
}
