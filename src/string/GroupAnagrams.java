package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		GroupAnagrams ga = new GroupAnagrams();
		ga.groupAnagrams(strs);

	}
	
	/*
    public List<List<String>> groupAnagrams(String[] strs) {
    	Map<String, List<String>> map = new HashMap<>();
    	for(int i=0; i<strs.length; i++) {
    		boolean flag = false;
    		for(Map.Entry<String, List<String>> entry:map.entrySet()) {
    			if(isAnagram(strs[i], entry.getKey())) {
    				flag = true;
    				entry.getValue().add(strs[i]);
    			}
    		}
    		if(flag==false) {
    			List<String> tmp = new ArrayList<>();
    			tmp.add(strs[i]);
    			map.put(strs[i],tmp);
    		}
    	}
    	List<List<String>> res = new ArrayList<>();;
    	for(Map.Entry<String, List<String>> entry:map.entrySet()) {
    		res.add(entry.getValue());
    	}
    	return res;
    }
    
    public boolean isAnagram(String s1, String s2) {
    	Map<Character,Integer> m1 = new HashMap<>();
    	Map<Character,Integer> m2 = new HashMap<>();
    	for(int i=0; i<s1.length(); i++) {
    		char key = s1.charAt(i);
    		if(m1.containsKey(key))
    			m1.put(key, m1.get(key)+1);
    		else
    			m1.put(key, 1);
    	}
    	for(int i=0; i<s2.length(); i++) {
    		char key = s2.charAt(i);
    		if(m2.containsKey(key))
    			m2.put(key, m2.get(key)+1);
    		else
    			m2.put(key, 1);
    	}
    	if(m1.size()!=m2.size()) return false;
    	for(Map.Entry<Character, Integer> entry:m1.entrySet()) {
    		if(!m2.containsKey(entry.getKey()) || m2.get(entry.getKey())!=entry.getValue()) {
    			return false;
    		}
    	}
    	return true;
    }
    */
	
	public List<List<String>> groupAnagrams(String[] strs) {  
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();  
        for (String s : strs) {  
            char [] str2char = s.toCharArray();  
            Arrays.sort(str2char);  
            String sortedStr = String.valueOf(str2char);  
            if(map.containsKey(sortedStr)){  
                map.get(sortedStr).add(s);  
            }else{  
                ArrayList<String> tmp = new ArrayList<String>();  
                tmp.add(s);  
                map.put(sortedStr, tmp);  
            }  
        }  
        List<List<String>> result = new ArrayList<List<String>>();  
        for (List<String> list : map.values()) {  
            //Collections.sort(list);  
            result.add(list);  
        }  
        return result;  
    }  
	
	
	
	

}
