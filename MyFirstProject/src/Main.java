import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        boolean number;
        number = random.nextBoolean();
        if(number) {
            System.out.println("Head");
        }
        else {
            System.out.println("Tail");
        }
    }
}
