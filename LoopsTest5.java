package com.loops.test;

import java.util.Scanner;

public class LoopsTest5 {
	public static void main(String args[]) {
		Scanner index = new Scanner(System.in);
		System.out.println("Enter any number");
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, sum;
		num1 = index.nextInt();
		num2 = index.nextInt();
		num3 = index.nextInt();
		num4 = index.nextInt();
		num5 = index.nextInt();
		num6 = index.nextInt();
		num7 = index.nextInt();
		num8 = index.nextInt();
		num9 = index.nextInt();
		num10 = index.nextInt();

		sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		System.out.println(sum);
	}

}
