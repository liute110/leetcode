package string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DesignLogStorageSystem {

}


class LogSystem {
	
	private HashMap<String, Integer> dmap = new HashMap<>();
	private final String[] gras = "Year:Month:Day:Hour:Minute".split(":");
	private final int[] ends = {4, 7, 10, 13, 16};

    public LogSystem() {
    }
    
    private String getKeyByGra(String timestamp, String gra) {
    	for(int i=0; i<gras.length; i++) {
    		if(gra.equals(gras[i])) {
    			return timestamp.substring(0,ends[i]);
    		}
    	}
    	return timestamp;
    }
    
    public void put(int id, String timestamp) {
        dmap.put(timestamp, id);
    }
    
    public List<Integer> retrieve(String s, String e, String gra) {
        String sk = getKeyByGra(s, gra);
        String ek = getKeyByGra(e, gra);
        List<Integer> res = new LinkedList<>();
        for(String key: dmap.keySet()) {
        	String ck = getKeyByGra(key, gra);
        	if(sk.compareTo(ck) <= 0 && ck.compareTo(ek) <= 0) {
        		res.add(dmap.get(key));
        	}
        }
        return res;
    }
}
