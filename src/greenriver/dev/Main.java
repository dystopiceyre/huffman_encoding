package greenriver.dev;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Assemble Huffman Tree of encoded text
        Print out the encoded message from the tree
        Decode the text, showing the saving in bits used
         */
        //Ask for string input
        Scanner scanner = new Scanner(System.in);
        FrequencyCounter freqCounter = new FrequencyCounter();
        HuffmanNode huffmanNode = new HuffmanNode();
        System.out.println("Welcome to my Huffman Encoder! Please enter a string to be encoded below.");
        String precode = scanner.nextLine();
        System.out.println("The input you entered was: "+precode);
        //Analyze and print out frequency of characters
        System.out.println("Analyzing the frequency of the characters in the input...");
        Map<Character, Double> countMap = freqCounter.getCount(precode);
        Map<Character, Double> freqMap = freqCounter.getFrequency(countMap);
        System.out.println("Character frequencies from the input:");
        for (Map.Entry<Character, Double> freq : freqMap.entrySet()) {
            System.out.println(freq.getKey() + "-> " +freq.getValue());
        }
        //Place characters into Huffman Nodes



    }
}
