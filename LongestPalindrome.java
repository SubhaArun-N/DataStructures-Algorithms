package ProblemSheet;

import java.util.HashMap;
import java.util.Map.Entry;

public class LongestPalindrome{
	
	public int getValue(char c) {
//		int a = Character.getNumericValue('a');
//		int z = Character.getNumericValue('z');
//		int val = Character.getNumericValue(c);
//		
//		if(a<=val && val<=z) {
//			return val - a;
//		}
//		return -1;
		
		return (int)c;
	}
	public int getLongestPalindrome(String s) {
		
		int count=0;
		
		char[] c = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<c.length;i++) {
			char ch = c[i];
			if(map.containsKey(ch)) {
				//map.get(ch).add(map.get(ch)+1);
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(c[i], 1);
			}
			
		}
		System.out.println(map);
			boolean foundOdd = false;
			
		for(Entry<Character, Integer> entry: map.entrySet()) {
			int val = entry.getValue();
			int key = entry.getKey();
			
			count = count + (val/2)*2;
		    map.remove(key);
		
			if(val%2 == 1) {
				foundOdd = true;
			}				
			
		}
		
		return (foundOdd)? count+1:count;
		
		/*USING HASHSET*/
		
		/*
		 HashSet<Character> set = new HashSet<Character>();
		 int count = 0;
		 for(int i=0;i<s.length();i++){
		 
		 char currChar = s.charAt(i);
		 if(set.contains(currChar)){
		 count = count+2;
		 set.remove(currChar);
		 }else{
		 set.add(currChar);
		 }
		 }
		 
		 if(set.size()>0){
		 count = count+1;
		 }
		 
		 return count;
		 */
		
	}
	public static void main(String[] args) {
		LongestPalindrome l = new LongestPalindrome();
		String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		System.out.println(l.getLongestPalindrome(s));
	}
}