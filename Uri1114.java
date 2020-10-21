import java.util.Scanner;
public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int senha;
        boolean senhacorreta=false;

        while (!senhacorreta){
            senha = teclado.nextInt();
            if(senha == 2002){
                System.out.println("Acesso Permitido");
                senhacorreta = true;
            }
            else{
                System.out.println("Senha Invalida");
            }
        }
    }
}