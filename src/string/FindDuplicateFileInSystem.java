package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindDuplicateFileInSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<String>> findDuplicate(String[] paths) {
    	List<List<String>> res = new ArrayList<>();
    	if(paths.length==0) return res;
    	Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i=0; i<paths.length; i++) {
        	String[] con = paths[i].split(" ");
        	for(int j=1; j<con.length; j++) {
        		String str = con[j].substring(con[j].indexOf("("), con[j].indexOf(")"));
        		if(map.containsKey(str)) {
        			map.get(str).add(con[0]+"/"+con[j].substring(0,con[j].indexOf("(")));
        		}
        		else {
        			ArrayList<String> val = new ArrayList<>();
        			val.add(con[0]+"/"+con[j].substring(0,con[j].indexOf("(")));
        			map.put(str,val);
        		}
        		
        	}
        }
        for(Map.Entry<String, List<String>> entry: map.entrySet()) {
        	if(entry.getValue().size()>1)
        		res.add(entry.getValue());
        }
        return res;
    }

}
