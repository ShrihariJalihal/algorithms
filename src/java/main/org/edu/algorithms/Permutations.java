package org.edu.algorithms;

import java.util.Arrays;

public class Permutations {

	public static void main(String[] args) {
		Permutations perm = new Permutations();
		System.out.println(perm.isPermutationsPresent("cab", "bac"));
	}
	
	public Boolean isPermutationsPresent(String firstString, String secondString) {
		if (firstString != null 
				&& !firstString.isEmpty() 
				&& secondString != null 
				&& !secondString.isEmpty()
				&& firstString.length() == secondString.length()) 
		{
			return this.getSortedCharString(firstString).equalsIgnoreCase(this.getSortedCharString(secondString));
		}
		
		return false;
	}
	
	private String getSortedCharString(String toBeSortedString) {
		char sortedArr[] = toBeSortedString.toCharArray(); 
		Arrays.sort(sortedArr);
		return new String (sortedArr); 
	}

}
