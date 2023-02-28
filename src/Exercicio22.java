import javax.swing.JOptionPane;

public class Exercicio22{
    public static void main(String[] args) {
        
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));

        for(int i = 1; i <= valor; i++){
            if(valor % i  == 0){
                System.out.println(i);
            }
        }
    }

}