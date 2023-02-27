import javax.swing.JOptionPane;

public class Exercicio16 {
    public static void main(String[] args) {
        
        int valorX, valorY;

        valorX = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira coordenada:"));
        valorY = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda coordenada: "));

        while (valorX != 0 && valorY != 0){
            if(valorX > 0 && valorY > 0){
                System.out.println("Primeiro");
            }else if(valorX >0 && valorY < 0){
                System.out.println("Quarto");
            }else if(valorX < 0 && valorY < 0){
                System.out.println("Terceiro");
            }else{
                System.out.println("segundo");
            }
        valorX = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira coordenada:"));
        valorY = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda coordenada: "));
        }
        System.out.println("Um dos valores é nulo");
        
    }
}
