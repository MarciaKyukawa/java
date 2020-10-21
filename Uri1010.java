import java.util.Scanner;
public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int peca1, qtde1, peca2, qtde2;
        double valor1, total1, valor2, total2, totalgeral;

        peca1 = teclado.nextInt(); qtde1 = teclado.nextInt(); valor1 = teclado.nextDouble();
        peca2 = teclado.nextInt(); qtde2 = teclado.nextInt(); valor2 = teclado.nextDouble();

        total1 = qtde1 * valor1;
        total2 = qtde2 * valor2;
        totalgeral = total1 + total2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalgeral);
    }
}