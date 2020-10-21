import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horaini, horafim, total;

        horaini = teclado.nextInt();
        horafim = teclado.nextInt();

        if(horafim > horaini){
            total = horafim - horaini;
        }
        else{
            total = 24 - horaini;
            total = total + horafim;
        }
        System.out.println("O JOGO DUROU "+total+" HORA(S)");
    }
}