import java.util.HashMap;

public class Mod3Zad3 {
    public HashMap<String, Integer> countWords(String text) {

        text = text.replaceAll("[!@#$%^&*(){},.;:<>+\\-/=_\\[\\]~]", "");
        String[] wordsInTextWithSpaces = text.split(" ");
        HashMap<String, Integer> wordToCount = new HashMap();

        for(String word : wordsInTextWithSpaces) {
            if(wordToCount.containsKey(word)) {
                wordToCount.put(word, wordToCount.get(word) + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }

        for (String key : wordToCount.keySet()) {
            System.out.println(key + " : " + wordToCount.get(key));
        }
        return wordToCount;
    }
}
