package com.home.array;

import java.util.Scanner;

public class ArthurQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*3. Number Palindrome
Write a program to check the number is palidrome. Use Scanner to input values
Example Input/Output:
1221    Number is a palindrome
4554    Number is a palindrome
1121    Number is not a palindrome (because reverse is 1211 and that is not equal to 1121
A palindrome number is a number which reversed equal to the original number. For example 121, 12321, 1001 etc
Logic to check a palindrome number:
Find the reverse of the given number. Store it in some variable say -reverse-. Compare the -number- with -reverse-.
If both are the same then then number is a palindrome otherwise it is not
Logic to reverse a number:
Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
Extract the last digit of the given number by performing the modulo division (remainder).
Store the last digit to some variable sat lastDigit = num % 10.
Increase the place value of reverse by one.
To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
Add lastDigit to reverse.
Since the last digit of the number is processed, remove the last digit of num. To remove the last digit dibide number by 10. Repeat steps until number is not equal to (or greater than) zero.*/
		
Scanner scan=new Scanner(System.in);
System.out.println("enter a number");
int num=scan.nextInt();
int lastnum=num;
int reverse=0;
int lastDigit=0;
while(num!=0) {
	lastDigit=num%10;
	
	reverse=reverse*10+lastDigit;
	num=num/10;
	
	
	
}
	System.out.println(reverse);	
	
	
	if(lastnum==reverse) {
		
		System.out.println("it is polindrom");
	}
	else {
		System.out.println("it is not polindrom");
	}
	}

}
