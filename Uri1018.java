import java.util.Scanner;
public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valentrada, nota100, nota50, nota20, nota10, nota5, nota2, nota1, resto;

        valentrada = teclado.nextInt();
        nota100 = valentrada / 100;
        resto = valentrada - nota100*100;
        nota50 = resto / 50;
        resto = resto - nota50 * 50;
        nota20 = resto / 20;
        resto = resto - nota20 * 20;
        nota10 = resto / 10;
        resto = resto - nota10 * 10;
        nota5 = resto / 5;
        resto = resto - nota5 * 5;
        nota2 = resto / 2;
        nota1 = resto - nota2 * 2;
        
        System.out.println(valentrada);
        System.out.printf(nota100+" nota(s) de R$ 100,00\n");
        System.out.printf(nota50+" nota(s) de R$ 50,00\n");
        System.out.printf(nota20+" nota(s) de R$ 20,00\n");
        System.out.printf(nota10+" nota(s) de R$ 10,00\n");
        System.out.printf(nota5+" nota(s) de R$ 5,00\n");
        System.out.printf(nota2+" nota(s) de R$ 2,00\n");
        System.out.printf(nota1+" nota(s) de R$ 1,00\n");
    }
}