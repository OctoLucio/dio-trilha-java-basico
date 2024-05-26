import java.util.concurrent.ThreadLocalRandom;
public class Candidatura {

    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "JÚLIA", "MARCOS", "CARLOS", "JOÃO", "CLÁUDIA"};
        double salarioBase = 2000.0;
        int x = 0;
        int candidselecionado = 0;
        while(candidselecionado < 5 && x < candidatos.length){
            double salary = valorPretendido();
            System.out.println("O salário pretendido de " + candidatos[x] + " é de " + salary + " R$ ");
                if (salary < salarioBase){
                    System.out.println(candidatos[x] + " foi selecionado(a)");
                    candidselecionado++;
                }
            x++;

        }

    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioPretendido > salarioBase){
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");}
        if(salarioPretendido < salarioBase){
            System.out.println("LIGAR PARA O CANDIDATO");}
        else{
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);  


    }




        }
    

