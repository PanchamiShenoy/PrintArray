package com.print;

public class PrintArray {
	/*
	 * to print integer array
	 */
	public static void toPrint(Integer[] inputArray) {
		for (int element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	/*
	 * to print double array
	 */
	public static void toPrint(Double[] inputArray) {
		for (double element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	/*
	 * to print character array
	 */
	public static void toPrint(Character[] inputArray) {
		for (char element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.0, 2.0, 3.0, 4.0 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		PrintArray.toPrint(intArray);
		PrintArray.toPrint(doubleArray);
		PrintArray.toPrint(charArray);

	}
}
