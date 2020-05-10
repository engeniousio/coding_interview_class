package Algos;

//        1. Input: What is the input parameter?
//        2. Output: What is the datatype of your answer that your function has to return?
//        3. What data structures and methods associated with it will be used?
//        4. Where are you going to store temporary data (if needed)?
//        5. Describe the model of your algorithm before implementing solution in code
//        6. Write unit tests for your solution -- think about edge cases
//        7. Runtime Complexity?
//        8. Memory Complexity?

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// please find the most repeated character in string
public class MostRepeatedChar {

    // init hashmap : < char : int >  -- character and corresponding number of occurrences
    // iterate through every char
    // look up if you have the char in your hashmap storage
    // if you don't have this char: insert to a hashmap with value: 1
    // if you do have this char: increment value

    public char mostRepeatedChar(String str) {
        if (str.isEmpty()) {
            return '0';
        }

        HashMap<Character, Integer> result = new HashMap<>();
        for(int i =0; i< str.length(); i++) {
            Character character = str.charAt(i);

            if (!result.containsKey(character)) {
                result.put(character, 1);
            } else {
                int currentValue = result.get(character);
                currentValue++;
                result.put(character, currentValue);
            }
        }

        Iterator it = result.entrySet().iterator();
        int maxValue = 0;
        Character winner = str.charAt(0);
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if((Integer)pair.getValue() > maxValue) {
                maxValue = (Integer)pair.getValue();
                winner = (Character)pair.getKey();
            }
        }
        return winner;
    }
}
