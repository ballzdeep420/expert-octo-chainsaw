package edu.hw.decimalToBinary;

public class Convert {
//	private int num;
//	public void printBinary() {
//		for(int i = 128; i >= 1; i/=2) {
//			if((num & i)!= 0)System.out.println("1 ");
//			else System.out.println("0 ");
//		}
//	}
	public void binaryForm(int num) {
		int rem;
		
		if(num <= 1) {
			System.out.print(num);
			return;
		}
		rem = num % 2;
		binaryForm(num >> 1);
		System.out.print(rem);
	}
}








