import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int funcionario, horas;
        double valorhora, salario;

        funcionario = teclado.nextInt();
        horas = teclado.nextInt();
        valorhora = teclado.nextDouble();

        salario = horas * valorhora;

        System.out.println("NUMBER = " +funcionario);
        System.out.printf("SALARY = U$ %.2f\n", salario );

    }
}