import javax.swing.JOptionPane;

public class Exercicio20 {
    public static void main(String[] args) {
        
        int valor;
        double nota1, nota2, div;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));

        for (int i = 1; i <= valor; i++){
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
            if(nota2 == 0){
                System.out.println("Divisão impossivel");
            }else{
                div = nota1 / nota2;
                System.out.println("Resultado " + div);
            }
        }
        

    }
    
}
