package com.interwiev;

public class Fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		int num0=0;
		int num1=1;
for (int i=2; i<12; i++) {
	
	sum=num0+num1;
	System.out.println(sum);
	num0=num1;
	num1=sum;
	
}
	}

}
