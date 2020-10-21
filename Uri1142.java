import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int linhas, val1, val2, val3;
        val1 = 1;
        val2 = 2;
        val3 = 3;

        linhas = teclado.nextInt();

        for(int cont=1; cont <= linhas; cont++){
            System.out.println(val1+" "+val2+" "+val3+" PUM");
            val1 = val1 + 4;
            val2 = val2 + 4;
            val3 = val3 + 4;
        }      
    }
}