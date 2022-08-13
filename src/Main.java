import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] word1 = {"Rahim","Yousuf", "Nejam","Shahin"};
        String[] word2 = {"Love", "Play", "Hate"};
        String[] word3 = {"FootBall", "Cricket", "Table Tennis", "Batminton"};

        Random random = new Random();
        int rand1 = random.nextInt(word1.length);
        int rand2 = random.nextInt(word2.length);
        int rand3 = random.nextInt(word3.length);

        System.out.println("Result ----------->");
        System.out.println(word1[rand1]+" "+ word2[rand2]+" "+word3[rand3]);

    }
}