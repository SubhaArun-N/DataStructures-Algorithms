package ProblemSheet;

import java.util.HashMap;

public class Isomorphic{
	
	public boolean isIsomorphic(String s, String t) {
		if(s.length() == 0 || t.length()==0) {
			return false;
		}
		
		if(s.length() != t.length()) {
			return false;
		}
		
		HashMap<Character, Character> sMap = new HashMap<Character, Character>();
        HashMap<Character, Character> tMap = new HashMap<Character, Character>();
		
		for(int i=0;i<s.length();i++) {
            for(int j=0;j<t.length();j++){
                char sChar = s.charAt(i);
     			char tChar = t.charAt(i);
               
     			
     			if(sMap.containsKey(sChar)) {
     				if(sMap.get(sChar) != tChar) {
     					return false;
     				}
     			}
     			else {
     				sMap.put(sChar, tChar);                           
     			}

                if(tMap.containsKey(tChar)) {
     				if(tMap.get(tChar) != sChar) {
     					return false;
     				}
     			}
     			else {
     				sMap.put(tChar, sChar);                           
     			}
		    }
        }			
		return true;
	}
	public static void main(String[] args) {
		Isomorphic ob = new Isomorphic();
		
		String s = "egg", t = "adg";
		
		System.out.println(ob.isIsomorphic(s,t));
		
	}
}