import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        Float X, Y, consumo;
        X = teclado.nextFloat();
        Y = teclado.nextFloat();

        consumo = X/Y;

        System.out.printf("%.3f km/l \n", consumo);


    }
}