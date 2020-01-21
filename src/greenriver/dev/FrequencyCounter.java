package greenriver.dev;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public Map<Character, Double> getCount(String precode) {
        Map<Character, Double> countMap = new HashMap<>();
        for (int i = 0; i < precode.length(); i++) {
            char character = precode.charAt(i);
            Double count = countMap.get(character);
            if (count != null) {
                countMap.put(character, count + 1);
            }
            else {
                countMap.put(character, 1.0);
            }
        }
        return countMap;
    }

    public Map<Character, Double> getFrequency(Map<Character, Double> countMap) {
        Double totalChars = 0.0;
        for (Double count : countMap.values()) {
            totalChars += count;
        }
        for (Map.Entry<Character, Double> count : countMap.entrySet()) {
           Double num = count.getValue();
           Double frequency = num/totalChars;
           countMap.put(count.getKey(), frequency);
        }
        return countMap;
    }

}
