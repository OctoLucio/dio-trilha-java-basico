import java.util.Scanner;
import java.time.LocalDate;

public class CalculadoraIdade {
    public static void main(String[] args) {
        // Cria um Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira o ano de nascimento
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        
        // Obtém o ano atual
        int anoAtual = LocalDate.now().getYear();
        
        // Calcula a idade
        int idade = anoAtual - anoNascimento;
        
        // Exibe a idade calculada
        System.out.println("Você tem " + idade + " anos de idade.");
        
        // Fecha o scanner
        scanner.close();
    }

}
