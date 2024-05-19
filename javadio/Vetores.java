import java.util.Arrays;
import java.util.Scanner;
public class Vetores
 {
    public static void main(String[] args) {
        //identificando tamanho da lista e chamada de valores.
        int v[] = {2, 4, 5, 9, 10};
        
        for(int c = 0; c < v.length; c++){
        System.out.print(v[c]);
        System.out.print(" ");}
         
        for (int val : v) {
            System.out.print(val);} 
        //Arrays.binarySearch(Posição de um value num dado array)
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o número que deseja descobrir a posição:");
        int num = teclado.nextInt();
        int y = Arrays.binarySearch(v, num);
        System.out.printf("O número %d está na posição %d", num, y);
        //Arrays.fill (preenchendo arrays)
        Arrays.fill(v,8);
        for(int x:v){
        System.out.print(x);
        }
    }
 }