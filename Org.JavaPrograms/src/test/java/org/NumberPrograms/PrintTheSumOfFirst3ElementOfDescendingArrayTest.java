package org.NumberPrograms;

public class PrintTheSumOfFirst3ElementOfDescendingArrayTest {
	public static void main(String[] args) {
		int [] a= {50,20,10,40,30};
		System.out.println(" Before Sorting ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1 ; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		int sum=0;
		for (int i = 0; i < 3; i++) {
			sum=sum+a[i];
		}
		System.out.println();
		
		System.out.println("Sum of First 3 Smallest Array Is :- "+sum);
	}
}
