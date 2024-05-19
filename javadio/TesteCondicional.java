import java.util.*;
import java.text.SimpleDateFormat;

public class TesteCondicional {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        String formattedDate = format.format(new Date());
        int year = Integer.parseInt(formattedDate);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        long nasc = teclado.nextLong();
        long idade = year - nasc;
        if(idade<16){
            System.out.println("Não vota!");}
        if(idade>=18 && idade<=70){
            System.out.println("Voto Obrigatório");}
       if (idade>=16 && idade<18 || idade>70){
            System.out.println("Voto opcional!");}
        teclado.close();
}
}