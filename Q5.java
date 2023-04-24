import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Q5 {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);

        String stringDigitada;
        List<Character> stringRevertida = new ArrayList<>();

        System.out.print("Escreva uma string para ser revertida: ");
        stringDigitada = sc.nextLine();

        for (int i = stringDigitada.length(); i > 0; i--){
            System.out.println(i);
            stringRevertida.add(stringDigitada.charAt(i - 1));
            
        }

        System.out.println("A string revertida é: " + stringRevertida);
    }
}
