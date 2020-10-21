import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero, pares, impares, negativos, positivos;
        pares = 0;
        impares = 0;
        negativos = 0;
        positivos = 0;

        for (int cont=1; cont <=5; cont++){
            numero = teclado.nextInt();
            if (numero%2==0){
                pares = pares +1;
            }
            else{
                impares = impares + 1;
            }
            if (numero > 0){
                positivos = positivos + 1;
            }
            if (numero < 0){
                negativos = negativos + 1;
            }
        }
        System.out.println(pares+" valor(es) par(es)");
        System.out.println(impares+" valor(es) impar(es)");
        System.out.println(positivos+" valor(es) positivo(s)");
        System.out.println(negativos+" valor(es) negativo(s)");

    }
}