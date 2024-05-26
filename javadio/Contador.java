import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
            contar(parametroUm,parametroDois);
            if (parametroUm>parametroDois){
			throw new Exception("Primeiro número deve ser menor que o segundo!");
            }
		
		}catch (Exception e) {
			System.out.println("Aconteceu um erro!");
            System.out.println(e.getMessage());
		}
    }

    static void contar(int num1, int num2){
        int contagem = num2 - num1;
        for(int c=1;c<=contagem;c++){
            System.out.print(c + " ");}


    }
	}
