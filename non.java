import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random r = new Random();
        int candidateNum = 10; // Example value
        int index = r.nextInt(candidateNum);
        
        System.out.println("Random index: " + index);
    }
}
