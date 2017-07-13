package string;

public class EditDistance {

	public int minDistance(String word1, String word2) {
		int len1 = word1.length();
		int len2 = word2.length();
		int temp1,temp2,temp3;
		int[][] distance = new int[len1+1][len2+1];
		for(int i = 0; i <= len2; i++){
			distance[0][i] = i;
		}
		for(int i = 1; i <= len1; i++){
			distance[i][0] = i;
		}
		for(int i = 1; i <=len1; i++){
			for(int j = 1; j <= len2; j++){
				temp1 = distance[i-1][j] + 1;
				temp2 = distance[i][j-1] + 1;
				if(word1.charAt(i-1) == word2.charAt(j-1)){
					temp3 = distance[i-1][j-1];
				}else{
					temp3 = distance[i-1][j-1] + 1;
				}
				distance[i][j] = minInThree(temp1, temp2, temp3);
			}
		}
        return distance[len1][len2];
    }
	
	private int minInThree(int num1, int num2, int num3){
		if(num1<= num2){
			if(num1 <= num3){
				return num1;
			}else{
				return num3;
			}
		}else{
			if(num2 <= num3){
				return num2;
			}else{
				return num3;
			}
		}
	}

}
