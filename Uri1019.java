import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int entsegundos, horas, minutos, segundos, resto;
        
        entsegundos = teclado.nextInt();

        horas = entsegundos /3600;
        resto = entsegundos - horas * 3600;
        minutos = resto /60;
        segundos = resto - minutos * 60;

        System.out.printf(horas+":"+minutos+":"+segundos+"\n");
                 

    }
}