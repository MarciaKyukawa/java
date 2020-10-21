import java.util.Scanner;
public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float entrada;
        String msg;

        entrada = teclado.nextFloat();
        msg = "";

        if (entrada < 0.0 || entrada > 100.0){
            msg = "Fora de intervalo";
        }
        else if(entrada > 75.0){
            msg = "Intervalo (75,100]";
        }
        else if(entrada > 50.0){
            msg = "Intervalo (50,75]";
        }
        else if(entrada > 25.0){
            msg = "Intervalo (25,50]";
        }
        else{
            msg = "Intervalo [0,25]";
        }
        System.out.println(msg);
    }
}