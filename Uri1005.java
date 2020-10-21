import java.util.Scanner;
public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B;
        double media;

        A = teclado.nextDouble();
        B = teclado.nextDouble();

        media = (A * 3.5 + B * 7.5)/11;

        System.out.printf("MEDIA = %.5f \n", media);
    }
}