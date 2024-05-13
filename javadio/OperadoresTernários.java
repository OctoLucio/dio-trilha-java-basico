public class OperadoresTernários {
    public static void main(String[] args) {
        int nota = 8;
        String sit = (nota>=7)?"Aprovado": (nota>=5 && nota<7)?"Recuperação":"Reprovado";
        System.out.println(sit);
    }
}
