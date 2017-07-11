package string;

public class StudentAttendanceRecordI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "LPLPLPLPLPL";
		StudentAttendanceRecordI sa = new StudentAttendanceRecordI();
		System.out.println(sa.checkRecord(s));

	}
	
    public boolean checkRecord(String s) {
        int a = 0;
        int maxL = 0;
        int curL = 0;
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i)=='L') curL++;
        	else {
        		if(curL>maxL) {
        			maxL = curL;
        		}
        		curL = 0;
        		if(s.charAt(i)=='A') a++;
        	}
        }
        if(curL>maxL) maxL= curL;
        System.out.println(maxL);
        if(a<=1 && maxL<=2) return true;
        return false;
    }

}
