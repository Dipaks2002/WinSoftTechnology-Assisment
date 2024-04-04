import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string:");
        String userInput = scanner.nextLine();

        Map<String, Integer> wordCounts = countWords(userInput);

        System.out.println("Occurrences of each word (case-insensitive):");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = input.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }
}

//OUTPUT:
//Enter your string:
//Dipak Sapate
//Occurrences of each word (case-insensitive):
//dipak: 1
//sapate: 1
