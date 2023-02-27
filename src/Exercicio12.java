import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Double valor1;

        valor1= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));

        if(valor1 == 0 && valor1 <=25){
            System.out.println("Intervalo [0,25]");
        }else if(valor1 > 25 && valor1 <= 50 ){
            System.out.println("Intervalo [25, 50]");
        }else if (valor1 > 50 && valor1 <=100){
            System.out.println("Intervalo [75, 100]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }  
}
