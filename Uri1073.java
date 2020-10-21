import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero, cont;
        cont = 2;
        numero = teclado.nextInt();

        while(cont <=numero){
                System.out.println(cont+"^2 = "+ (cont*cont));
            cont = cont + 2;
        }
    }
}