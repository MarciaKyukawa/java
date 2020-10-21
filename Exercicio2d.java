import java.util.Scanner;
public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        Float area, base1, base2, altura;

        System.out.println("digite base maior");
        base1 = teclado.nextFloat();
        System.out.println("digite base menor");
        base2 = teclado.nextFloat();
        System.out.println("digite altura");
        altura = teclado.nextFloat();

        area = (base1 + base2)*altura/2;

        System.out.printf("area do trapezio %.4f %f1 \n", area, area);
    }
}