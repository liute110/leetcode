package string;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder(); // result
        String[] str = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int value[]=    {1000,900,500,400, 100, 90,  50, 40,  10, 9, 5, 4, 1};   

        for(int i=0; num!=0; ++i){
             while(num >= value[i]){
                 num = num - value[i];
                 sb.append(str[i]);
             }
         }
        return sb.toString();
        }

}
