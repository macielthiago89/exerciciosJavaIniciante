import javax.swing.JOptionPane;

public class Exercicio08 {
    public static void main(String[] args) {
        
        int valorA;

        valorA = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        if(valorA % 2 == 0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
    }
}
