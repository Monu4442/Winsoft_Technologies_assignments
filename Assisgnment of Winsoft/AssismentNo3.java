import java.util.HashMap;

public class AssismentNo3 {
    public static void main(String[] args) {
        String str = "I am Kunal and I am verry verry Smart Boy";


        String[] words = str.trim().split("\\s+");

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
        }

        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
