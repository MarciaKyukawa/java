import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float A, B, C, perimetro, area;

        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();

        if((A + B > C) && (A+C > B) && (B+C > A)){
            perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }
        else{
            area = (A + B)* C/2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}