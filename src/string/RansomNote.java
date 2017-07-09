package string;

import java.util.HashMap;
import java.util.Map;
public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote=="") return true;
        if(magazine=="") return false;
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i=0; i<ransomNote.length(); i++) {
        	if(map1.containsKey(ransomNote.charAt(i))) {
        		map1.put(ransomNote.charAt(i),map1.get(ransomNote.charAt(i))+1);
        	}
        	else
        		map1.put(ransomNote.charAt(i), 1);
        }
        for(int i=0; i<magazine.length(); i++) {
        	if(map2.containsKey(magazine.charAt(i))) {
        		map2.put(magazine.charAt(i),map2.get(magazine.charAt(i))+1);
        	}
        	else
        		map2.put(magazine.charAt(i), 1);
        }
        
        for(Map.Entry<Character, Integer> entry : map1.entrySet()) {
        	char key = entry.getKey();
        	if(!map2.containsKey(key) || map1.get(key)>map2.get(key)) return false;
        }
        return true;
        
    }

}
