// Laura Caroline Pinto Correia 20.00171-0

import java.util.concurrent.ThreadLocalRandom;

public class ID {
    public static String gerarID(int idBem, String usuario, double valor){
        int numeroAleatorio = ThreadLocalRandom.current().nextInt(10000, 99999);
        return String.format("%d;%s;%.2f;%d", 
            idBem,
            usuario, 
            valor, 
            numeroAleatorio);
    }
}