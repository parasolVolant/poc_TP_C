
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        PremiersNombresPremiers[] mesTaches = new PremiersNombresPremiers[4];



        for (int i = 0; i < 4; i++) {
            mesTaches[i] = new PremiersNombresPremiers();
            executor.execute(mesTaches[i]);
        }



        executor.shutdown();

        while(!executor.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.print("#");
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            PremiersNombresPremiers.premiersNombresPremiers.addAll(mesTaches[i].);
        }

        Collections.sort(PremiersNombresPremiers.premiersNombresPremiers);
        System.out.println(PremiersNombresPremiers.premiersNombresPremiers);
    }

}
