package string;

public class ComplexNumberMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

    public String complexNumberMultiply(String a, String b) {
    	String[] sa = a.split("[+]");
    	String[] sb = b.split("[+]");
    	int na =  Integer.valueOf(sa[0]);
    	int nb = Integer.valueOf(sb[0]);
    	String[] ma = sa[1].split("i");
    	String[] mb = sb[1].split("i");
    	int mna = Integer.valueOf(ma[0]);
    	int mnb = Integer.valueOf(mb[0]);
    	String first = String.valueOf(na*nb - mna*mnb);
    	String second = String.valueOf(na*mnb + nb*mna);
    	return first + "+" + second + "i";
    }
    
}
