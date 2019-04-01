package edu.hw.mainClass;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

import edu.hw.array.Array;
import edu.hw.decimalToBinary.Convert;


public class mainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Array ar = new Array();
		System.out.println("Imput array size: ");
		int input = sc.nextInt();
		
		int [] arrays = ar.initializingArray(input);
		ar.printArray(arrays);
		Arrays.sort(arrays);
		int min = ar.getMin(arrays);
		System.out.println("Minimum value is: " + min);
		ar.printSortedArray(arrays);
		
		int num;
		Convert con = new Convert();
		System.out.println("Imput number: ");
		num = sc.nextInt();
		int num2 = num;
		
		if(num < 0)
			System.out.println("Error!");
		else { System.out.print("Binary: ");
		con.binaryForm(num);
		System.out.println();
		System.out.println("New binary!");
		System.out.print(Integer.toBinaryString(num));
		}
		System.out.println();
		
		Stack<Integer> stack = new Stack<Integer>();
		while(num != 0) {
			int d = num % 2;
			stack.push(d);
			num /= 2;
		}
		
		System.out.println("Binary3!");
		while(!(stack.isEmpty())) {
			System.out.print(stack.pop());
		}
		System.out.println();
		
		int key = num2;
		int res = Arrays.binarySearch(arrays, key);
		
		if(res >= 0)
			System.out.println(key + " found in: " + res);
		else
			System.out.println(key + " Null!");
		
		sc.close();
	}
}