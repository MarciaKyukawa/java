import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salAtual, salNovo, reajuste;
        int percentual;

        salAtual = teclado.nextFloat();

        if(salAtual > 2000.0){
            percentual = 4;
        }
        else if(salAtual > 1200.0){
            percentual = 7;
        }
        else if(salAtual > 800.0){
            percentual = 10;
        }
        else if(salAtual > 400.0){
            percentual = 12;
        }
        else {
            percentual = 15;
        }

        reajuste = salAtual * percentual /100;
        salNovo = salAtual + reajuste;

        System.out.printf("Novo Salario: %.2f\n", salNovo);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: "+ percentual +" %");
    }
}