package com.codingproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramCheck {
	
	public List<List<String>> getAnagramWords(String input) {
		
		String[] words = input.split("\\s+");
		HashMap<String, List<String>> anagramMap = new HashMap<>();
		List<List<String>> anagramResultList = new ArrayList<>();
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			char[] wordsChars = word.toCharArray();
			Arrays.sort(wordsChars);
			String wordSorted = new String(wordsChars);
			
			if(anagramMap.containsKey(wordSorted)) {
				anagramMap.get(wordSorted).add(word);
			}else {
				List<String> anagramList = new ArrayList<>();
				anagramList.add(word);
				anagramMap.put(wordSorted, anagramList);
			}
			
			
		}
		
		for( Map.Entry<String, List<String>> entry:  anagramMap.entrySet()) {
			if(entry.getValue().size() > 1) {
				anagramResultList.add(entry.getValue());
			}
		}
		
		return anagramResultList;	
	}
}
