import java.util.Scanner;

public class Leituras{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int     valorInteiro;
        double  valorReal;

        System.out.println("Por favor, digite um valor inteiro");
        valorInteiro= teclado.nextInt();
        System.out.println("Valor inteiro Digitado = " +valorInteiro);

        System.out.println("Por favor, digite um valor real");
        valorReal= teclado.nextDouble();
        System.out.println("Valor real Digitado = " +valorReal);

    }
}