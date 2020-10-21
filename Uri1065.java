import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero, pares=0;

        for(int cont=1; cont <=5; cont++){
            numero = teclado.nextInt();
            if(numero%2==0){
                pares = pares +1;
            }
        }
        System.out.println(pares+" valores pares");
    }
}