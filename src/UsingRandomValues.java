import java.util.Random;

public class UsingRandomValues {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(10)+1;
            System.out.println(num);
        }

    }
}
