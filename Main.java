import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        String phrase = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        phrase = phrase.replaceAll("\\W+"," ").trim();
        String[] phraseTemp = phrase.split("\\s");
        System.out.println(Arrays.toString(phraseTemp));

        for (int i = 0; i < phraseTemp.length; i++){

            sum = sum + Integer.parseInt(phraseTemp[i]);
        }
        System.out.println(sum/phraseTemp.length);
    }
}
