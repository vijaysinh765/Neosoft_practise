package collectionFramework;

import java.util.HashMap;

public class CountWordsInAGivenStringStatement {
	
	     public static void main(String[] args) {
	        String inputString = "This is a simple Java program using HashMap to count the number of words in a given string";
	        HashMap<String, Integer> wordCountMap = countWords(inputString);

	        for (String word : wordCountMap.keySet()) {
	            int count = wordCountMap.get(word);
	            System.out.println(word + " : " + count);
	        }
	    }

	    public static HashMap<String, Integer> countWords(String input) {
	        String[] words = input.split(" ");
	        HashMap<String, Integer> wordCountMap = new HashMap<>();

	        for (String word : words) {
	            word = word.toLowerCase(); // Ignore case sensitivity
	            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
	        }

	        return wordCountMap;
	    }
	}


