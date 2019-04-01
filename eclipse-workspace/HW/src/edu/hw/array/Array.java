package edu.hw.array;
import java.util.Random;


public class Array {
	private Random rand = new Random(10); //creating rand obj
	
	public Array() {
		//Random rand = new Random(10);
		//rand.setSeed(10);
	}
	/*
	 * This method creates
	 * @array size
	 * 
	 */
	private int[] createArrays(int size) {//creating method, using variable "SIZE"
		int [] array = new int[size];
		return array;
	}
	/*
	 * This method fills array with a value
	 * @param array[]
	 * @return array
	 * 
	 */
	public int[] initializingArray(int size) {
		int [] array = createArrays(size);
		for(int i = 0;i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}
		return array;
	}
	/*
	 * This method provides values for the array
	 * @param array
	 * 
	 */
	public void printArray(int array[]) {
		for(int i = 0;i<array.length;i++) {
			System.out.println("Array["+ (i+1) +"] = "+array[i]);
		}
	}
	public int getMin(int[]array) {
		int min = array[0];
		for(int i = 0;i<array.length;i++) {
			if(min>array[i])min = array[i];
		}
		return min;
	}
	public void sort(int array[]) {
		int n = array.length;
		
		for(int i = 0; i < n-1; i++) {
			int min = i;
			for(int j = i+1; j < n; j++)
				if(array[j] < array[min])
					min = j;
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}
	public void printSortedArray(int array[]) {
		int n = array.length;
		for(int i = 0; i < n; ++i)
			System.out.println("Sorted array["+(i+1)+"] "+ array[i]);
		System.out.println();
	}
}




