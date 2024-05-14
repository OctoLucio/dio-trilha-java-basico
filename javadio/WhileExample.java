import java.util.concurrent.ThreadLocalRandom;
public class WhileExample {

    public static void main(String[] args) {
        double mesada = 50.0;

        int contador = 0;

        while (mesada>0) {
            double compras = valorAleatorio();
            mesada -= compras;
            contador ++;
        
        
            System.out.println("Valor da compra :" + compras);
            System.out.println("Total de itens : " + contador);}
        System.out.println(mesada);
        System.out.println("Mesada totalmente gasta. Aguardar próximo mês.");

        }

        

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);

    
    }

}
