import java.util.HashMap;
import java.util.Map;

public class AssignmentNo4 {
    public static void main(String[] args) {
        String str = "Java Treniee Developer";
        
        
        str = str.toLowerCase();
       
        Map<Character, Integer> charCountMap = new HashMap<>();
        
       
        for (char ch : str.toCharArray()) {
          
            if (Character.isLetter(ch)) {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }
        
        
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times here");
            }
        }
    }
}
