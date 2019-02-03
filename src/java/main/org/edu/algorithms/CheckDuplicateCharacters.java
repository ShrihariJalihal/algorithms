package org.edu.algorithms;

public class CheckDuplicateCharacters {

	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxyz";
		String s1= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		CheckDuplicateCharacters chkd = new CheckDuplicateCharacters();
		
		System.out.println(chkd.containsDuplicate(s));
		System.out.println(chkd.containsDuplicate(s1));
		System.out.println(chkd.containsDuplicate("aadfsjdgkjsdgjksgjksdgjksdgjksdg"));
		System.out.println(chkd.containsDuplicate("sdf23234"));
		
		
	}
	
	
	public Boolean containsDuplicate(String s) {
		boolean[] charIntArr = new boolean[128];
		for (Character chr : s.toCharArray()) {
			System.out.println(chr);
			boolean val = charIntArr[Character.getNumericValue(chr)];
			if (!val) {
				charIntArr[Character.getNumericValue(chr)] = true;
			} else {
				return true;
			}
		}
		return false;
	}

}
