package com.sapient.trg.util;

import com.sapient.trg.pl.App;

public class MyMath {

	//Perfect Number
	public static boolean isPerfectNumber(int n) {
		long sum=0;  
		for(int i=1; i <= n/2; i++)  
		{  
			if(n % i == 0)  
			{  
				sum=sum + i;  
			}  
		}  
		if(sum==n) {
			return true;   
		}
		return false;
	}

	//Factorial
	public static long factorial(int n) {
		if (n == 0)
			return 1;
		return n*factorial(n-1);
	}

	//Is Prime
	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	//Sum of Prime
	public static int sumOfPrime(int n) { 
		int sum = 0;  
		for (int i = n; i >= 1; i--)   
		{  
			boolean prime = isPrime(i);  
			if (prime)   
			{  
				sum = sum + i;  
			}  
		}
		return sum;  
	} 

	//Armstrong Number
	public static boolean isArmstrongNumber(int n) {
		int temp, digits=0, last=0, sum=0;   
		temp=n;   
		while(temp>0)    
		{   
			temp = temp/10;   
			digits++;   
		}   
		temp = n;   
		while(temp>0)   
		{   
			last = temp % 10;   
			sum +=  (Math.pow(last, digits));   
			temp = temp/10;   
		}  
		if(n==sum)  
			return true;
		else return false;   
	}   

	//Reverse Number
	public static int reverseNumber(int n) {
		boolean isNoNegative = n < 0 ? true : false;   
		if(isNoNegative)  
		{  
			n = n * -1;  
		}   
		int reverse = 0;   
		int lastDigit = 0;   
		while (n >= 1)   
		{  
			lastDigit = n % 10;  
			reverse = reverse * 10 + lastDigit;   
			n = n / 10;  
		}   
		return isNoNegative == true? reverse*-1 : reverse;   
	}
	
	//Decimal to Binary
	public static int decimalToBinary(int n) {
		int B_Number = 0;
		int cnt = 0;
		while (n != 0) {
			int rem = n % 2;
			double c = Math.pow(10, cnt);
			B_Number += rem * c;
			n /= 2;
			cnt++;
		}

		return B_Number;
	}

	//Binary to Decimal
	public static int binaryToDecimal(int n) {
		int num = n;
		int dec_value = 0;
		int base = 1;
		int temp = num;
		while (temp > 0) {
			int last_digit = temp % 10;
			temp = temp / 10;
			dec_value += last_digit * base;
			base = base * 2;
		}
		return dec_value;
	}

	//Sum of N Fibonacci Numbers
	public static int getSumOfNfibos(int n) {
		if (n <= 0)
			return 0;
		int fibo[]=new int[n+1];
		fibo[0] = 0; fibo[1] = 1;
		int sum = fibo[0] + fibo[1];
		for (int i=2; i<=n; i++)
		{
			fibo[i] = fibo[i-1]+fibo[i-2];
			sum += fibo[i];
		}
		return sum;
	}

	//Palindrome
	public static boolean isPalindrome(int n) {
		int r,sum=0,temp;
		temp=n;    
		while(n>0){    
			r=n%10;  //getting remainder  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		if(temp==sum)    
			return true;    
		else    
			return false;
	}

	public static void main(String[] args) {
		MyMath mymath= new MyMath();
		System.out.println("6 is a Perfect Number : "+ isPerfectNumber(6));
		System.out.println("Factorial of 6 : "+ factorial(6));
		System.out.println("6 is a prime number : "+ isPrime(6));
		System.out.println("Sum of prime from 1 to 6 : "+ sumOfPrime(6));
		System.out.println("2 is a Armstrong Number : "+ isArmstrongNumber(6));
		System.out.println("Reverse of 1234 : "+ reverseNumber(1234));
		System.out.println("Decimal to Binary of 6 : "+ decimalToBinary(6));
		System.out.println("Binary to decimal of 110 : "+ binaryToDecimal(110));
		System.out.println("Sum of first 6 fibonacci numbers : "+ getSumOfNfibos(4));
		System.out.println("121 is a Palindrome : "+ isPalindrome(121));
	}

}
