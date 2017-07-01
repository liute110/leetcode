package array;

public class SpiralMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
    public int[][] generateMatrix(int n) {
    	if(n <= 0) return new int[0][0]; 
        int[][] res = new int[n][n];
        int counter = 1;
        
        //���������ĸ��߽�
        int left = 0;
        int right = res[0].length - 1;
        int top = 0;
        int bottom = res.length - 1;
        int i;
        while(true) {
        	//�ϱߣ���������
        	for(i=left; i<=right; i++) res[top][i] = counter++;
        	if(++top>bottom) break;
        	
        	//�ұߣ���������
        	for(i=top; i<= bottom; i++) res[i][right] = counter++;
        	if(left > -- right) break;
        	
        	//�±ߣ���������
        	for(i=right; i>=left ;i--) res[bottom][i] = counter++;
        	if(top > --bottom) break;
        	
        	//��ߣ���������
        	for(i=bottom; i>=top; i--) res[i][left] = counter++;
        	if(++left > right) break;
        }
        return res;
        
    }
    

}
