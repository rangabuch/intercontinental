package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.codingproblems.AnagramCheck;

public class AnagramCheckTest {


	@Test
	public void getAnagramWordsTest() {
		String input = "apt ask tap tom pat red mot";
		
		List<String> list1 = Arrays.asList("tom", "mot");
		List<String> list2 = Arrays.asList("apt", "tap", "pat");

		List<List<String>> listOfAnagramsTestData = new ArrayList<List<String>>();
		listOfAnagramsTestData.add(list1);
		listOfAnagramsTestData.add(list2);
		
		AnagramCheck anagramCheck = new  AnagramCheck();
		List<List<String>> listOfAnagrams = anagramCheck.getAnagramWords(input);
		System.out.println(listOfAnagramsTestData.equals(listOfAnagrams));
		for(List<String> anagrams: listOfAnagrams) {
			System.out.println(anagrams);
		}
		for(List<String> anagrams: listOfAnagramsTestData) {
			System.out.println(anagrams);
		}
	}	
	

}
