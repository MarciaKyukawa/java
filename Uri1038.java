import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo, qtde;
        float total;

        codigo = teclado.nextInt();
        qtde = teclado.nextInt();

        if (codigo == 1){ //cachorro quente
            total = qtde * 4.0f;
        }
        else if (codigo == 2){ //x-salada
            total = qtde * 4.5f;
        }
        else if (codigo == 3){ //X-bacon
            total = qtde * 5.0f;
        }
        else if (codigo == 4){ // torrada Simples
            total = qtde * 2.0f;
        }
        else{ // refigerante
            total = qtde * 1.5f;
        }

        System.out.printf("Total: R$ %.2f\n", total);

    }
}