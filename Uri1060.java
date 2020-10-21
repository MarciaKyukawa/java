import java.util.Scanner;
public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int qtde, qtdePositivo;
        float numero;
        qtdePositivo = 0;

        for(qtde=1; qtde <= 6; qtde++){
            numero = teclado.nextFloat();
            if (numero > 0){
                qtdePositivo = qtdePositivo + 1;
            }
        }
        System.out.println(qtdePositivo+" valores positivos");
    }
}