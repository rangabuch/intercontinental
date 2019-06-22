package test;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.codingproblems.SumOfPairs;

public class SumOfPairsTest {

	@Test
	public void printSumPairsTest() {
		SumOfPairs sumOfPairs = new SumOfPairs();
		Integer sum = 7;
		int[] input = {1, 2, 3, 4, 5, 6};
		Map<Integer, Integer> sumPairs = sumOfPairs.getSumPairs(input, sum);
		Map.Entry<Integer, Integer> entry = sumPairs.entrySet().iterator().next();
		Integer pairSum = entry.getKey()+entry.getValue();
		sum.equals(pairSum);
		assertTrue("sum of pair found",sum.equals(pairSum));
		
		for (Map.Entry<Integer, Integer> entryPair : sumPairs.entrySet()) {
			System.out.println(entryPair.getKey()+","+entryPair.getValue());
		}
	}

}
