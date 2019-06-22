package com.codingproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SumOfPairs {

	public Map<Integer, Integer> getSumPairs(int[] input, int sum) {
		Map<Integer, Integer> sumPair = new HashMap<>();
		Set<Integer> hashSetPair = new HashSet<>();
		for(int num: input) {
			int dif = sum - num;
			if(hashSetPair.contains(dif)) {
				sumPair.put(num, dif);
			}else {
				hashSetPair.add(num);
			}
		}
		return sumPair;
	}
}
