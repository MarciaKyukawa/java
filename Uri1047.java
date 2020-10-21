import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horaini, minini, horafim, minfim, horatotal, mintotal, minutosI, minutosF, duracao;

        horaini = teclado.nextInt();
        minini = teclado.nextInt();
        horafim = teclado.nextInt();
        minfim = teclado.nextInt();

        minutosI = horaini * 60 + minini;
        minutosF = horafim * 60 + minfim;

        duracao = minutosF - minutosI;

        if(duracao <= 0){
            duracao = duracao + 24 * 60;
        }
        
        horatotal = duracao / 60;
        mintotal = duracao % 60;

        System.out.println("O JOGO DUROU "+horatotal+" HORA(S) E "+mintotal+" MINUTO(S)");
    }
}
