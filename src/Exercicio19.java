import javax.swing.JOptionPane;

public class Exercicio19 {
    public static void main(String[] args) {
        
        int valor;
        int in = 0;
        int out = 0;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));

        for(int i = 1  ; i<=valor ; i++){

            int valor1;
            valor1 =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de numero " + i + ":"));
            if(valor1 >= 10 && valor1 <= 20){
                in += 1;

            }else{
                out+=1;

            }        
        }
        System.out.println("In:" + in);
        System.out.println("out:" + out);
    }
    
}
