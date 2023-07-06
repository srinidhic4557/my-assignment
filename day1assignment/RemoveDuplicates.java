package week3.day1assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
	}
	String text = "We learn java basics as part of java sessions in java week1";
	
	int count=0;
	String[] split = text.split("");
	Set<String>values=new LinkedHashSet<String>();{
	for(String text :split) {
	values.add(text);}
System.out.println(values);
}
}
