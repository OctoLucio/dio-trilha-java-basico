public class Condicionais {
    public static void main(String[] args) {
        double saldo = 16;
        double valorSolicitado = 17.0;
        if (valorSolicitado < saldo)
            saldo -= valorSolicitado;
        else
            System.out.println("Saldo insuficiente");
        System.out.println(saldo);
        
    }
}
