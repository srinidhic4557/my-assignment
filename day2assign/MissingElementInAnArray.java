package week3.day2assign;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,7,6,8};
		List<Integer> list1=new ArrayList <Integer>(Arrays.asList(arr));
		
		Collections.sort(list1);
		for(int i=1;i<=list1.size();i++) {
		if(i!=list1.get(i-1)) {
			System.out.println(i);
			break;
		}
}
}
}