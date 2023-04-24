import java.util.Scanner;

public class Q2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int valor1 = 0, valor2 = 1, soma = 0, numDigitado;

        System.out.print("Digite um número e verifique se está na sequência de Fibonacci: ");
        numDigitado = scanner.nextInt();

        while (soma < numDigitado){
            soma = valor1 + valor2;
            valor1 = valor2;
            valor2 = soma;
        }
        
        if(soma == numDigitado){
            System.out.println("O número pertence à sequência");
        }else{
            System.out.println("O número não pertence à sequência");
        }
    }
}
