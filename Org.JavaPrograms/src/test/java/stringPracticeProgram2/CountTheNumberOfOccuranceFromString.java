package stringPracticeProgram2;
/**
 * 
 * @author SHUBH
 * Count The Number Of Occurence From string 
 */
public class CountTheNumberOfOccuranceFromString {
	public static void main(String[] args) {
		String str="good morning";
		String str2 = str.replace(" ", "");
		System.out.println(str2);
		char[] ch = str2.toCharArray();
		int size = ch.length;
		for (int i = 0; i < size; i++) {
			int count=1;
			for (int j = i+1; j < size; j++) {
				if (ch[i]==ch[j]) {
					count++;
					int k=j;
					while (k<size-1) {
						ch[k]=ch[k+1];
						k++;
					}
					size--;
					j--;
				}
			}
			System.out.println(ch[i]+" :- "+count);
		}
	}
}
