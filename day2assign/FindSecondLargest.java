package week3.day2assign;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7 };

		int length = data.length;
		
		Arrays.sort(data);
	
		System.out.println(data[length - 2]);

	

	}

}
