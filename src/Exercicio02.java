import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, result;
        System.out.println("Digite o primeiro valor: ");
        valor1 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = sc.nextInt();
        result = valor1 + valor2;
        System.out.println("Valor da soma é = " + result);
        sc.close();
    }    
}
