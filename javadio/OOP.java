public class OOP {
    public static void main(String[] args) {
        
    
        Caneta c1 = new Caneta();
        c1.carga = 2 ;
        c1.cor = "Azul";
        c1.tampar();
        c1.status();
        c1.rabiscar();
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
    

       }
}