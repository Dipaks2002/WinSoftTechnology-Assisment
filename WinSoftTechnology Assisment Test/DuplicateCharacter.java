import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

class CharacterDuplicatesFinder {

    static void findDuplicates(String input){
        HashMap<Character, Integer> characterCountMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char chr = input.charAt(i);
            if(characterCountMap.containsKey(chr)){
                int count = characterCountMap.get(chr);
                characterCountMap.put(chr, ++count);
            } else {
                characterCountMap.put(chr, 1);
            }
        }
        Set<Character> characterSet = characterCountMap.keySet();
        System.out.println("Duplicate Characters: ");
        for (Character chr : characterSet){
            int count = characterCountMap.get(chr);
            if(count > 1){
                System.out.println(chr + " - " + count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        findDuplicates(input);
    }
}

/*Output:-
 *enter the String:
 * "Winsoft Technology"
	=> Duplicate Characters:
		n - 2
		o - 3
*/
