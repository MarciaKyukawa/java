import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero, cont;

        numero = teclado.nextInt();
        cont = 0;

        while (cont < 6){
            if(numero %2 != 0){
                cont = cont +1;
                System.out.println(numero);
            }
            numero = numero + 1;
        };
        
    }
}