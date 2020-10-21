import java.util.Scanner;
public class SistemaDaEscolaIF{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int p1, p2;
        double media;
        System.out.println("Digite a nota da P1");
        p1 = teclado.nextInt();
        System.out.println("Digite a nota da P2");
        p2 = teclado.nextInt();
        media = (p1 + p2)/2;

        if (media >= 6.0){
            System.out.printf("Parabens, passou de ano. Sua media e: %.1f\n", media);
        }
        else{
            System.out.printf("Reprovado. Sua media e: %.1f\n", media);
        }
        System.out.println("Fim do programa");
    }
}