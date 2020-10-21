import java.util.Scanner;
public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float tempo, velocidade, media;

        tempo = teclado.nextFloat();
        velocidade = teclado.nextFloat();

        media = (tempo * velocidade) / 12;

        System.out.printf("%.3f\n", media);
    }
}