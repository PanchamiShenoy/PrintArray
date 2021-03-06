package com.print;

public class PrintArray {
	public static <E> void toPrint(E[] inputArray) {
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.0, 3.0, 4.0 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		PrintArray.toPrint(intArray);
		PrintArray.toPrint(doubleArray);
		PrintArray.toPrint(charArray);

	}
}
