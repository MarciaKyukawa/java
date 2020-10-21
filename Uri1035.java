import java.util.Scanner;
public class Uri1035{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D;
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
/*
1- se B for maior do que C e 
2- se D for maior do que A, 
3- e a soma de C com D for maior que a soma de A e B e 
4- se C e D, ambos, forem positivos e 
5- se a variável A for par 
escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
*/
    if ((B > C) && (D > A) && (C+D > A+B) && (C > 0 && D > 0) && (A % 2 == 0)){
        System.out.println("Valores aceitos");
    }
    else{
        System.out.println("Valores nao aceitos");
    }

    }
}