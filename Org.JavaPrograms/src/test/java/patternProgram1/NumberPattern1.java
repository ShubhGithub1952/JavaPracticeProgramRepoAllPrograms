package patternProgram1;

public class NumberPattern1 {
	public static void main(String[] args) {
		int n=5;
		int num=9;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print((num++%9)+1+" ");
					
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}
