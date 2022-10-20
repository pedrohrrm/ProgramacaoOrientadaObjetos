
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Questao7 {
    public static void main(String args[]) {
        Scanner texto = new Scanner(System.in);
        String str;
        System.out.println("Digite o seu nome:");
        str = texto.nextLine();
        System.out.println("O nome digitado foi:" + str);
        texto.close();
    }
}

