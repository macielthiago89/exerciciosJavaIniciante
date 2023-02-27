import javax.swing.JOptionPane;

public class Exercicio17 {
    public static void main(String[] args) {
        
        int cod;
        int somaalcool = 0,somagasolina = 0,somadiesel = 0;
        JOptionPane.showMessageDialog(null,"Digite o codigo:");
        JOptionPane.showMessageDialog(null,"1 = Alcool / 2 = Gasolina / 3 = Diesel / 4 = Fim");
        cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo:"));

        while(cod != 4){
            if(cod == 1){
                somaalcool += 1;
                JOptionPane.showMessageDialog(null,"Digite o codigo:");
                JOptionPane.showMessageDialog(null,"1 = Alcool / 2 = Gasolina / 3 = Diesel / 4 = Fim");
                cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo:"));
            }else if(cod == 2){
                somagasolina += 1;
                JOptionPane.showMessageDialog(null,"Digite o codigo:");
                JOptionPane.showMessageDialog(null,"1 = Alcool / 2 = Gasolina / 3 = Diesel / 4 = Fim");
                cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo:"));
            }else if(cod == 3){
                somadiesel += 1;
                JOptionPane.showMessageDialog(null,"Digite o codigo:");
                JOptionPane.showMessageDialog(null,"1 = Alcool / 2 = Gasolina / 3 = Diesel / 4 = Fim");
                cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo:"));
            }else{
                JOptionPane.showMessageDialog(null,"Codigo invalido. Digite novamente");
                JOptionPane.showMessageDialog(null,"1 = Alcool / 2 = Gasolina / 3 = Diesel / 4 = Fim");
                cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo:"));
            }
        
        }
        System.out.println("Muito obrigado");
        System.out.println("Alcool: " + somaalcool);
        System.out.println("Gasolina: " + somagasolina);
        System.out.println("Diesel: " + somadiesel);

    }
    
}
