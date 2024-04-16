import java.util.Random;

public class RandomWordGenerator {
    public static void main(String[] args) {
        int wordLength = 8; 
        String randomWord = generateRandomWord(wordLength);
        System.out.println("Random Word: " + randomWord);
    }

    private static String generateRandomWord(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            sb.append(randomChar);
        }

        return sb.toString();
    }
}
