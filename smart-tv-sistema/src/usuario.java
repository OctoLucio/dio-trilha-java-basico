public class usuario {
    public static void main(String[] args) throws Exception {
        smartTv smartTv = new smartTv();
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);



        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        
    }
}
