package week3.day2assign;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {

		ArrayList<String> word = new ArrayList<String>();
		word.add("HCL");
		word.add("Wipro");
		word.add("Aspire Systems");
		word.add("CTS");
		Collections.sort(word, Collections.reverseOrder());

		System.out.println(word);

	}

}
