import java.util.Scanner;

public class Uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, C, media, media1, media2, media3;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        media1 = A * 2;
        media2 = B * 3;
        media3 = C * 5;
        media = (media1 + media2 + media3)/10;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}