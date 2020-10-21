import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int qtde, qtdePositivo;
        float numero, soma, media;
        qtdePositivo = 0;
        soma = 0;
        media = 0;

        for(qtde=1; qtde <= 6; qtde++){
            numero = teclado.nextFloat();
            if (numero > 0){
                qtdePositivo = qtdePositivo + 1;
                soma = soma + numero;
            }
        }
        System.out.println(qtdePositivo+" valores positivos");
        media = soma / qtdePositivo;
        System.out.printf("%.1f\n", media);
    }
}