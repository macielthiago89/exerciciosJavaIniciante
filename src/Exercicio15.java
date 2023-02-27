import javax.swing.JOptionPane;

public class Exercicio15 {
    public static void main(String[] args) {
        
        int senha;

        senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));

        while(senha != 2002){
            senha = Integer.parseInt(JOptionPane.showInputDialog("Senha incorreta, digite novamente: "));
        }
        System.out.println("Acesso permitido");
    }
    
}

