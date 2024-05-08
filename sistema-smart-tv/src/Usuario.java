public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada: "+smartTv.ligada);
        System.out.println("Canal Atual: "+smartTv.canal);
        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.Ligar();
        System.out.println("novo status -> TV Ligada: "+smartTv.ligada);

        smartTv.Desligar();
        System.out.println("novo status -> TV Ligada: "+smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume: "+smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal: "+smartTv.canal);

        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.aumentarVolume();
        System.out.println("Canal: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);
    }    
}
