package org.NumberProgramOnDigits;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int temp1=temp;
		int sum=0;
		int count=0;
		while (num>0) {
			num=num/10;
			count++;
		}
		//System.out.println(count);
		while (temp>0) {
			int rem=temp%10;
			int cube=count;
			int mul=1;
			while (cube>0) {
				mul=mul*rem;
				cube--;
			}
			sum=sum+mul;
			temp=temp/10;
		}
		if (sum==temp1) {
			System.out.println(sum+" :- is a Armstrong Number ! ");
		}else {
			System.out.println(sum+" :- isnot a Armstrong Number ! ");
		}
		
	}
}
