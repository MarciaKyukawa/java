import java.util.Scanner;
public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float area, base, altura;

        System.out.println("Informe a altura do triangulo");
        altura = teclado.nextFloat();
        System.out.println("Informe a base do triangulo");
        base = teclado.nextFloat();

        area = (altura * base)/2;

        System.out.println("area do triangulo " +area);
    }
}