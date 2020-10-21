import java.util.Scanner;
public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int totaldias, anos, meses, dias, resto;

        totaldias = teclado.nextInt();
        anos = totaldias / 365;
        resto = totaldias - anos * 365;
        meses = resto /30;
        dias = resto - meses * 30;
        System.out.printf(anos+" ano(s)\n");
        System.out.printf(meses+" mes(es)\n");
        System.out.printf(dias+" dia(s)\n");
        
    }
}