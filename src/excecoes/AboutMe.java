package excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//trabalhando com estruturas de exceções...
public class AboutMe {
    public static void main(String[] args) {
        try {

            //o "use locale" define que o código receberá informações de acordo com o padrão americano
            //então, em variáveis float, receberá dados com ponto ao invés de vírgula
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();


            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        }

        catch (InputMismatchException e){
            //pode ser um "System.err.println" também
            System.out.println("Os campos idade e altura precisam ser numéricos.");
        }
    }
}
