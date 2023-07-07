package week3.day2assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer>list1=new ArrayList<Integer>(Arrays.asList(arr));
		for(int i=0;i<list1.size();i++) 
			for(int j=i+1;j<list1.size();j++) {
				
				if(list1.get(i)==list1.get(j))
		
		System.out.println("Duplicate Number is "+list1.get(i));

	}

}

}