import java.util.Scanner;
public class Exercicio2b{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float area, lado, altura;

        System.out.println("Informe o valor do lado");
        lado = teclado.nextFloat();

        System.out.println("Informe o valor da altura");
        altura = teclado.nextFloat();

        area = lado * altura;

        System.out.println("Valor da area do retangulo" + area);
    }
}