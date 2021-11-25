import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        int min = 1;
        int max = 3000;

        int i=0;
        long valor;
        while (i < 5) {
            valor = (long) Math.floor(Math.random() * (min - max + 1) + max);
            i++;
            try {
                System.out.println(valor);
                Thread.sleep(valor);
                System.out.println("START...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("END...");

    }
}
