package string;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
	
	public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        String[] map = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        char[] tmp = new char[digits.length()];
        if(digits.length() == 0)
            return result;
        rec(digits, 0, tmp, map, result);
        return result;
    }
    public void rec(String digits, int index, char[] tmp, String[] map, List<String> result){
        if(index == digits.length()){
            result.add(new String(tmp));
            return;
        }
        char tmpChar = digits.charAt(index);
        for(int i = 0; i < map[tmpChar - '0'].length(); i++){
            tmp[index] = map[tmpChar - '0'].charAt(i);
            rec(digits, index + 1, tmp, map, result);
        }
    }

}
